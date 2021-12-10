<template>
  <ModalComponent modal="modal-prevent">
    <ModalContentNotImplemented />
  </ModalComponent>
  <ModalComponent modal="modal-test">
    <div class="container">
      <div class="text-center pb-3 text-capitalize fw-bolder f">
        Pantalla de vista Previa de funcionalidad
      </div>
      <button
        class="btn btn-danger p-2"
        data-bs-target="#modal-test"
        data-bs-toggle="modal"
      >
        Cerrar
      </button>
    </div>
  </ModalComponent>
  <section class="container-sm">
    <nav class="nav">
      <div class="nav-cont">
        <p class="" v-on:click="this.$router.push('/')">Petsgram</p>
        <div class="cont-input">
          <i class="search fas fa-search"></i>
          <input type="text" placeholder="Buscar" />
        </div>
        <div class="iconos">
          <i v-on:click="this.$router.push('/')" class="home fas fa-home"></i>
          <i
            data-bs-toggle="modal"
            data-bs-target="#modal-prevent"
            class="plus far fa-plus-square"
          ></i>
          <i
            data-bs-toggle="modal"
            data-bs-target="#modal-prevent"
            class="heart fas fa-heart"
          ></i>
          <img
            class="small-logo"
            src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
            alt="fotoPerfil"
          />
        </div>
      </div>
    </nav>
    <header class="header">
      <div class="perfil-container">
        <img
          class="img-perfil"
          src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
          alt="fotoPerfil"
        />
        <div class="contenedor-cabezera">
          <div class="cabezera1">
            <h1>olliethegoodest</h1>
            <button data-bs-toggle="modal" data-bs-target="#modal-prevent">
              Editar perfil
            </button>
            <i
              data-bs-toggle="modal"
              data-bs-target="#modal-prevent"
              class="settings fas fa-cog"
            ></i>
          </div>
          <div class="cabezera2">
            <p class="publicaciones"><b>6</b> publicaciones</p>
            <p class="seguidores"><b>52,5k</b> seguidores</p>
            <p class="seguidos"><b>70</b> seguidos</p>
          </div>
          <div class="cabezera3">
            <h2>Ollie the Sheepadoodle 🐾</h2>
            <p class="p-desc1">🐶 F1 Medium Sheepadoodle</p>
            <p class="p-desc2">🎂 7/26/20</p>
            <p class="p-desc3">📍 Bay Area, CA</p>
          </div>
        </div>
      </div>
    </header>
    <div class="container-main">
      <div class="main">
        <div class="linea"></div>
        <div class="main-nav">
          <a href="#">
            <svg
              aria-label="Publicaciones"
              class="_8-yf5"
              fill="#262626"
              height="12"
              viewBox="0 0 48 48"
              width="12"
            >
              <path
                clip-rule="evenodd"
                d="M45 1.5H3c-.8 0-1.5.7-1.5 1.5v42c0 .8.7 1.5 1.5 1.5h42c.8 0 1.5-.7 1.5-1.5V3c0-.8-.7-1.5-1.5-1.5zm-40.5 3h11v11h-11v-11zm0 14h11v11h-11v-11zm11 25h-11v-11h11v11zm14 0h-11v-11h11v11zm0-14h-11v-11h11v11zm0-14h-11v-11h11v11zm14 28h-11v-11h11v11zm0-14h-11v-11h11v11zm0-14h-11v-11h11v11z"
                fill-rule="evenodd"
              ></path>
            </svg>
            PUBLICACIONES
          </a>
        </div>
        <div class="images mainCont__grid">
          <div class="">
            <img
              data-bs-toggle="modal"
              data-bs-target="#modal-prevent"
              src="https://www.dogmal.com/wp-content/uploads/2017/02/Sheepadoodle-930x600.jpg"
              alt=""
            />
          </div>
          <div>
            <img
              data-bs-toggle="modal"
              data-bs-target="#modal-prevent"
              src="https://i.pinimg.com/474x/14/87/32/1487321f9cb4166f66db77bf64d7baa9.jpg"
              alt=""
            />
          </div>
          <div>
            <img
              data-bs-toggle="modal"
              data-bs-target="#modal-prevent"
              src="https://gfp-2a3tnpzj.stackpathdns.com/wp-content/uploads/2019/10/Duke4-600x600.jpg"
              alt=""
            />
          </div>
          <div>
            <img
              data-bs-toggle="modal"
              data-bs-target="#modal-prevent"
              src="https://www.feathersandfleece.com/wp-content/uploads/2019/07/breeding-left.jpg"
              alt=""
            />
          </div>
          <div>
            <img
              data-bs-toggle="modal"
              data-bs-target="#modal-prevent"
              src="https://texasdoodlesforsale.com/wp-content/uploads/elementor/thumbs/mini_sheepadoodle_puppy-p5o729jha7c3dxx2xyuqv0c303bx2clpd00wc453bs.jpg"
              alt=""
            />
          </div>
          <div>
            <img
              data-bs-toggle="modal"
              data-bs-target="#modal-prevent"
              src="https://images.agreatertown.com/image3604528.jpg"
              alt=""
            />
          </div>
        </div>
      </div>
    </div>
  </section>
</template>
<script>
import ModalContentNotImplemented from "@/components/ModalContentNotImplemented";
import ModalComponent from "@/components/ModalComponent";
import { Modal } from "bootstrap";
export default {
  name: "Profile-View",
  components: { ModalComponent, ModalContentNotImplemented },
  mounted() {
    let modalAdvice = new Modal(document.getElementById("modal-test"));
    modalAdvice.show();
  },
};
</script>

<style scoped>
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
  font-family: "Averia Libre", cursive;
}

nav {
  position: fixed;
  width: 100%;
  z-index: 1;
  border-bottom: solid #dbdbdb 1px;
  background: linear-gradient(to bottom, #abdbdd 0%, #f5f5f5 20%) no-repeat
    center center fixed;
  display: flex;
  justify-content: center;
  align-items: center;
}

.header {
  width: 100vw;
  display: flex;
  justify-content: center;
  align-items: center;
}

.nav-cont {
  font-size: 25px;
  font-weight: 500;
  color: #ffff;
  width: 50%;
  display: flex;
  cursor: pointer;
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  justify-content: space-between;
  align-items: center;
  padding: 10px 50px;
}

.search {
  color: rgba(255, 255, 255, 0.67);
  font-size: 15px;
  height: 17px;
  margin-right: 5px;
}

.cont-input {
  height: 28px;
  display: flex;
  margin: 0 0.5rem;
  align-items: center;
  padding: 5px;
  background: rgba(238, 244, 250, 0.67);
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 6px;
}

.settings {
  font-size: 23px;
  width: 10px;
  height: 24px;
  left: 80px;
  color: #000;
  cursor: pointer;
}

.cont-input input {
  font-size: 15px;
  border: 0;
  outline: none;
  background: transparent;
}

.small-logo {
  object-fit: cover;
  width: 27px;
  height: 25px;
  border-radius: 50%;
  cursor: pointer;
  box-shadow: 0 4px 4px rgba(0, 0, 0, 0.25);
}
.iconos {
  display: flex;
  align-items: center;
}

.home {
  padding: 0 0.5rem;
  cursor: pointer;
}

.plus {
  padding: 0 0.5rem;

  cursor: pointer;
}

.heart {
  padding: 0 0.5rem;

  cursor: pointer;
}

header {
  transform: translateY(60px);
  padding: 20px 0;
}

.perfil-container {
  display: flex;
}

.perfil-container img {
  object-fit: cover;
  height: 150px;
  width: 160px;
  border-radius: 50%;
  cursor: pointer;
}

.contenedor-cabezera {
  margin-left: 50px;
  width: 330px;
}

.cabezera1 {
  width: 320px;
  display: flex;
  align-items: center;
  margin-bottom: 15px;
  justify-content: space-between;
}

.cabezera1 h1 {
  color: #000;
  font-weight: 100;
  font-size: 26px;
}

.cabezera1 button {
  font-size: 16px;
  width: 100px;
  height: 30px;
  margin-left: 8px;
  background: transparent;
  border: solid #000 1px;
  border-radius: 8px;
  cursor: pointer;
}

.cabezera1 svg {
  cursor: pointer;
}

.cabezera2 {
  display: flex;
  justify-content: space-between;
  font-size: 15px;
  margin-bottom: 15px;
}

.cabezera2 .publicaciones {
  margin-right: 10px;
}

.cabezera2 .seguidores {
  margin-right: 10px;
}

.cabezera2 .seguidos {
  margin-right: 10px;
}

.cabezera3 h2,
.cabezera3 .p-ciencia,
.cabezera3 .p-desc1,
.cabezera3 .p-desc2,
.cabezera3 .p-desc3 {
  font-size: 16px;
  margin-bottom: 5px;
}

.linea {
  width: 100%;
  height: 1px;
  background-color: #dbdbdb;
}

.main-nav {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 50%;
  margin: auto;
  padding: 15px;
}

.main-nav a {
  color: #333;
  text-decoration: none;
  font-size: 13px;
}
.container-sm {
  position: relative;
  display: flex;
  flex-direction: column;
  justify-items: center;
}

.main {
  margin: 60px 0 0;
  width: 90vw;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  max-width: 60%;
}

.mainCont__grid {
  display: grid;
  justify-content: center;
  grid-template-columns: repeat(3, 1fr);
  grid-template-rows: repeat(5, auto);
  gap: 1%;
}

.mainCont__grid div > img {
  object-fit: cover;
  width: 95%;
  height: 95%;
  cursor: pointer;
}

.container-main {
  width: 100vw;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-items: center;
  justify-content: center;
}
.images img {
  transition: all 0.4s;
}

.images img:hover {
  transform: scale(1.1);
}
</style>
