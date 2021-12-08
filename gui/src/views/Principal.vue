<template>
  <!-- Start: Container -->
  <div class="container">
    <header>
      <span
        class="iconify user"
        data-icon="carbon:user-avatar-filled-alt"
        style="color: white"
      ></span>
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
      <button class="boast">
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
          >
            <img v-bind:src="defineSrc(item.username)" alt="{{item}}" />
            <p>{{ item.username }}</p>
          </div>
          <button class="pet__container--add">Agregar otra mascota</button>
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

export default {
  name: "PrincipalView",
  data() {
    return {
      pets: [],
      user: "",
    };
  },
  methods: {
    defineSrc(pet) {
      return `https://petsgram-pets.herokuapp.com/pets/${pet}/profile-pic`;
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
        })
        .then((response) => {
          console.log("response");
          console.log(response);
          this.pets = response.data.getPetsByOwner;
        })
        .catch((error) => {
          console.log(id);
          console.error(error);
        });
    },
  },
  created() {
    this.getPets();
  },
};
</script>

<style scoped>
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
}

img {
  border-radius: 25px;
  height: 100px;
  width: 100px;
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
}
</style>
