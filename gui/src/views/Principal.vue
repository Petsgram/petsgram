<template>
  <!-- Start: Container -->
  <ModalComponent @close="close">
    <ModalContentCreatePet
      @close="close"
      @createPet="createPet"
      :username="this.user"
    />
  </ModalComponent>
  <ModalComponent modal="modal-prevent">
    <ModalContentNotImplemented />
  </ModalComponent>
  <div class="container">
    <header>
      <div class="exit" v-on:click="closeSession" title="Cerrar Sesión">
        <span class="iconify user" data-icon="mdi:exit-run"></span>
        Cerrar Sesión
      </div>
    </header>
    <main>
      <!-- Start: Description -->
      <h1 class="title">Petsgram</h1>
      <p class="description">
        La red social donde tus mascotas <br />
        son las protagonistas
      </p>
      <!-- End: Description -->

      <h3 class="greet">Buenos dias {{ this.user }}!</h3>

      <!-- Start: Show off your pet -->
      <button
        class="boast"
        data-bs-toggle="modal"
        data-bs-target="#modal-prevent"
      >
        Presume a tu mascota...
        <div class="boast__icon">
          <span
            class="iconify camera"
            data-icon="ant-design:camera-filled"
            style="color: white"
          ></span>
          <p>subir</p>
        </div>
      </button>
      <!-- End: Show off your pet -->

      <!-- Start: Information about your pets -->
      <div class="pet">
        <h2>Tus mascotas</h2>
        <div class="pet__container">
          <div
            class="pet__container--item"
            v-for="item in this.pets"
            :key="item"
            v-on:click="openProfile"
          >
            <img :src="item.image" alt="{{item}}" />
            <p>{{ item.username }}</p>
          </div>
          <button
            class="btn pet__container--add"
            data-bs-toggle="modal"
            data-bs-target="#modal"
          >
            Agregar otra mascota
          </button>
        </div>
      </div>
      <!-- End: Information about your pets -->
    </main>
  </div>
  <!-- End: Container -->
</template>

<script>
import gql from "graphql-tag";
import jwt_decode from "jwt-decode";
import ModalComponent from "../components/ModalComponent";
import ModalContentCreatePet from "@/components/ModalContentCreatePet";
import { forgetCache } from "@apollo/client/cache/inmemory/reactiveVars";
import { Modal } from "bootstrap";
import ModalContentNotImplemented from "@/components/ModalContentNotImplemented";

export default {
  name: "PrincipalView",
  components: {
    // eslint-disable-next-line vue/no-unused-components
    ModalContentNotImplemented,
    ModalContentCreatePet,
    ModalComponent,
  },
  data() {
    return {
      pets: [],
      user: "",
    };
  },
  methods: {
    closeSession() {
      localStorage.clear();
      setTimeout(() => {
        this.$router.push("/login");
      }, 10);
    },
    openProfile() {
      this.$router.push("/profile");
    },
    close: async function () {
      let myModal = new Modal(document.getElementById("modal"), {
        keyboard: false,
      });

      myModal.hide();
      // const modalsBackdrops = document.getElementsByClassName("modal-backdrop");
      // for (let i = 0; i < modalsBackdrops.length; i++) {
      //   document.body.removeChild(modalsBackdrops[i]);
      // }
    },
    createPet: async function (pet) {
      console.log("multipart", pet);
      await fetch("https://petsgram-pets.herokuapp.com/pets", {
        mode: "no-cors",
        headers: {
          "Content-Type": "*/*",
        },
        method: "POST",
        body: pet,
      })
        .then((res) => {
          console.log(res);
          this.getPets().then(async () => {
            await this.setImages();
          });
        })
        .catch((err) => {
          this.getPets().then(async () => {
            await this.setImages();
          });
          alert("Error al subir la imagen");
          console.log(err);
        });
    },
    chooseRandomPet() {
      let num = Math.floor(Math.random() * (20 - 2) + 2);
      let root = require.context(
        "@/assets/images/collection_pets/",
        false,
        /\.(png|jpe?g|svg)$/
      );
      return root("./img (" + num + ").jpg");
      // return `../assets/images/collection_pets/img (${num}).jpg`;
    },
    defineSrc: async function (pet) {
      // return `https://petsgram-pets.herokuapp.com/pets/${pet}/profile-pic`;
      // eslint-disable-next-line no-unreachable
      return (
        this.$apollo
          .query({
            query: gql`
              query ($pet: String!) {
                getPetPicture(username: $pet)
              }
            `,
            variables: {
              pet,
            },
          })
          // eslint-disable-next-line no-unused-vars
          .then((res) => {
            console.log(
              `https://petsgram-pets.herokuapp.com/pets/${pet}/profile-pic`
            );
            return `https://petsgram-pets.herokuapp.com/pets/${pet}/profile-pic`;
          })
          // eslint-disable-next-line no-unused-vars
          .catch((error) => {
            console.log(this.chooseRandomPet());
            return this.chooseRandomPet();
          })
      );
    },
    getUserName: async function () {
      const token = localStorage.getItem("access_token");
      const decoded = jwt_decode(token);
      let user = "";
      await this.$apollo
        .query({
          query: gql`
            query Query($id: Int!) {
              getUser(id: $id) {
                username
              }
            }
          `,
          variables: {
            id: decoded.user_id,
          },
        })
        .then((response) => {
          user = response.data.getUser.username;
          this.user = user;
          return user;
        })
        .catch((error) => {
          console.log(error);
          return null;
        });

      return user;
    },
    getPets: async function () {
      const id = await this.getUserName();
      forgetCache({
        id: "getPetsByOwner",
      });
      await this.$apollo
        .query({
          query: gql`
            query Query($owner: String!) {
              getPetsByOwner(owner: $owner) {
                username
                image
              }
            }
          `,
          variables: {
            owner: id,
          },
          fetchPolicy: "no-cache",
        })
        .then((response) => {
          console.log("response");
          console.log(response);
          this.pets = response.data.getPetsByOwner;
          let pets = [];
          const requireContext = require.context(
            "@/assets/images/collection_pets/",
            false,
            /\.(png|jpe?g|svg|gif)$/
          );
          for (const pet in this.pets) {
            const newPet = {
              username: this.pets[pet].username,
              image: requireContext("./" + "img (0).gif"),
            };
            pets.push(newPet);
          }
          this.pets = pets;
          return this.pets;
        })
        .catch((error) => {
          console.log(id);
          console.error(error);
        });
    },
    setImages: async function () {
      console.log("created");
      let newPets = [];
      for (let pet of this.pets) {
        console.log("pet -> ", pet);
        const newPet = {
          username: pet.username,
          image: await this.defineSrc(pet.username),
        };
        newPets.push(newPet);
      }
      this.pets = newPets;
      console.log("newPets -> ", this.pets);
    },
  },
  created() {
    this.getPets().then(async () => {
      await this.setImages();
    });
  },
};
</script>

<style lang="scss" scoped>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

.container {
  height: 100vh;
  min-width: 100vw;
}

header {
  align-items: center;
  display: flex;
  flex-direction: row-reverse;
  height: 50px;
}

main {
  align-items: center;
  display: flex;
  flex-direction: column;
}

.title {
  color: #1d3557;
  font-family: "Averia Libre", cursive;
  font-size: 38px;
  font-weight: bold;
}

.description {
  color: #457b9d;
  font-family: "Poppins", sans-serif;
  font-size: 12px;
  font-weight: 400;
  text-align: center;
}

.greet {
  color: #457b9d;
  font-family: "Poppins", sans-serif;
  font-size: 24px;
  font-weight: 500;
  margin: 50px 0;
}

.boast {
  align-items: center;
  background: linear-gradient(to bottom, #edf3f900 70%, #edf3f9 100%);
  border: none;
  border-radius: 3px;
  box-shadow: 0 20px 20px -1px #c4c4c488;
  display: flex;
  font-family: "Poppins", sans-serif;
  font-size: 12px;
  font-weight: 400;
  height: 50px;
  justify-content: space-between;
  margin-bottom: 50px;
  padding-left: 15px;
  text-align: left;
  width: 180px;
}

.boast__icon {
  color: #fff;
  background-color: #457b9d;
  border-radius: 3px;
  display: flex;
  flex-direction: column;
  font-family: "Poppins", sans-serif;
  font-size: 8px;
  font-weight: 400;
  height: 100%;
  text-align: center;
  width: 70px;
}

.pet {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

h2 {
  color: #457b9d;
  font-family: "Poppins", sans-serif;
  font-size: 12px;
  font-weight: 400;
  margin-bottom: 30px;
}

.pet__container {
  display: flex;
  flex-wrap: wrap;
  max-width: 80vw;
  justify-content: center;
  align-content: center;
  align-items: center;
}

.pet__container--item,
.pet__container--add {
  margin-right: 20px;
  cursor: pointer;

  &:hover {
    transform: scale(1.1);
  }
}

img {
  border-radius: 25px;
  height: 100px;
  width: 100px;
  object-fit: cover;
}

.pet__container--item > p {
  font-family: "Averia Libre", cursive;
  font-size: 11px;
  font-weight: 400;
  text-align: center;
}

.pet__container--add {
  align-items: center;
  border: none;
  background: none;
  color: #457b9d;
  display: flex;
  font-family: "Poppins", sans-serif;
  font-size: 12px;
  font-weight: 400;
  height: 100px;
  text-align: center;
  width: 100px;
}

.camera {
  height: 80%;
  width: 100%;
}

.user {
  height: 35px;
  width: 100px;
  color: white;
}

.user:hover {
  transform: scale(1.05);
  cursor: pointer;
}

.exit {
  padding: 1rem;
  margin-top: 1rem;
  cursor: pointer;
  display: flex;
  flex-direction: column;
  font-size: 10px;
  color: white;
  text-shadow: 1px 0px 5px #1d3557;
}
</style>
