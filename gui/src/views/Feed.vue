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
  <nav>
    <div class="nav-cont">
      <p class="" style="cursor: pointer" v-on:click="this.$router.push('/')">
        Petsgram
      </p>
      <div class="cont-input">
        <i class="search fas fa-search"></i>
        <input type="text" placeholder="Buscar" />
      </div>
      <div class="iconos">
        <div class="icons">
          <i v-on:click="$router.push('/feed')" class="home fas fa-home"></i>
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
            v-on:click="$router.push('/profile')"
            src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
            alt="fotoPerfil"
          />
        </div>
      </div>
    </div>
  </nav>
  <div style="height: 54px"></div>
  <div class="main-body container">
    <div class="main-x">
      <div class="newfeed">
        <div class="single-user">
          <div class="post-nav">
            <div class="user-profile">
              <img
                src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
              />
              <p>olliethegoodest</p>
            </div>
            <div class="dotdot">
              <p></p>
              <p></p>
              <p></p>
            </div>
          </div>
          <div class="post-picture">
            <img
              src="https://www.razasdperros.com/wp-content/uploads/2021/01/sheepadoodle-caracteristicas-y-comportamiento-e1621007880200.jpg"
            />
          </div>
          <div class="footer">
            <div class="left-side">
              <svg
                aria-label="Like"
                class="_8-yf5"
                color="#8e8e8e"
                fill="#8e8e8e"
                height="24"
                role="img"
                viewBox="0 0 48 48"
                width="24"
              >
                <path
                  d="M34.6 6.1c5.7 0 10.4 5.2 10.4 11.5 0 6.8-5.9 11-11.5 16S25 41.3 24 41.9c-1.1-.7-4.7-4-9.5-8.3-5.7-5-11.5-9.2-11.5-16C3 11.3 7.7 6.1 13.4 6.1c4.2 0 6.5 2 8.1 4.3 1.9 2.6 2.2 3.9 2.5 3.9.3 0 .6-1.3 2.5-3.9 1.6-2.3 3.9-4.3 8.1-4.3m0-3c-4.5 0-7.9 1.8-10.6 5.6-2.7-3.7-6.1-5.5-10.6-5.5C6 3.1 0 9.6 0 17.6c0 7.3 5.4 12 10.6 16.5.6.5 1.3 1.1 1.9 1.7l2.3 2c4.4 3.9 6.6 5.9 7.6 6.5.5.3 1.1.5 1.6.5.6 0 1.1-.2 1.6-.5 1-.6 2.8-2.2 7.8-6.8l2-1.8c.7-.6 1.3-1.2 2-1.7C42.7 29.6 48 25 48 17.6c0-8-6-14.5-13.4-14.5z"
                ></path>
              </svg>
              <svg
                aria-label="Comment"
                class="_8-yf5"
                color="#8e8e8e"
                fill="#8e8e8e"
                height="24"
                role="img"
                viewBox="0 0 48 48"
                width="24"
              >
                <path
                  clip-rule="evenodd"
                  d="M47.5 46.1l-2.8-11c1.8-3.3 2.8-7.1 2.8-11.1C47.5 11 37 .5 24 .5S.5 11 .5 24 11 47.5 24 47.5c4 0 7.8-1 11.1-2.8l11 2.8c.8.2 1.6-.6 1.4-1.4zm-3-22.1c0 4-1 7-2.6 10-.2.4-.3.9-.2 1.4l2.1 8.4-8.3-2.1c-.5-.1-1-.1-1.4.2-1.8 1-5.2 2.6-10 2.6-11.4 0-20.6-9.2-20.6-20.5S12.7 3.5 24 3.5 44.5 12.7 44.5 24z"
                  fill-rule="evenodd"
                ></path>
              </svg>
              <svg
                aria-label="Share Post"
                class="_8-yf5"
                color="#8e8e8e"
                fill="#8e8e8e"
                height="24"
                role="img"
                viewBox="0 0 48 48"
                width="24"
              >
                <path
                  d="M47.8 3.8c-.3-.5-.8-.8-1.3-.8h-45C.9 3.1.3 3.5.1 4S0 5.2.4 5.7l15.9 15.6 5.5 22.6c.1.6.6 1 1.2 1.1h.2c.5 0 1-.3 1.3-.7l23.2-39c.4-.4.4-1 .1-1.5zM5.2 6.1h35.5L18 18.7 5.2 6.1zm18.7 33.6l-4.4-18.4L42.4 8.6 23.9 39.7z"
                ></path>
              </svg>
            </div>
            <div class="right-side">
              <svg
                aria-label="Save"
                class="_8-yf5"
                color="#8e8e8e"
                fill="#8e8e8e"
                height="24"
                role="img"
                viewBox="0 0 48 48"
                width="24"
              >
                <path
                  d="M43.5 48c-.4 0-.8-.2-1.1-.4L24 29 5.6 47.6c-.4.4-1.1.6-1.6.3-.6-.2-1-.8-1-1.4v-45C3 .7 3.7 0 4.5 0h39c.8 0 1.5.7 1.5 1.5v45c0 .6-.4 1.2-.9 1.4-.2.1-.4.1-.6.1zM24 26c.8 0 1.6.3 2.2.9l15.8 16V3H6v39.9l15.8-16c.6-.6 1.4-.9 2.2-.9z"
                ></path>
              </svg>
            </div>
          </div>
          <div class="details">
            <div class="liked-by">
              <img
                src="https://www.terranea.es/assets/images/razas/perro_de_agua_espanol.jpg"
              />
              <p>Liked by <b>earthfever and 12,276 </b>others</p>
            </div>
            <div class="post-text">
              <b>olliethegoodest</b> Am the most haps today bc I found out what
              day it is… FRIDAY! 🎉
            </div>
            <div class="hours-ago">18 hours ago</div>
          </div>
        </div>
      </div>
      <div class="main-nav">
        <div class="user-pro">
          <div class="left-side">
            <img
              src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
            />
            <div class="names">
              <h1>olliethegoodest</h1>
              <h2>Ollie the Sheepadoodle 🐾</h2>
            </div>
          </div>
        </div>
        <div class="suggestions">
          <div class="left">Sugerencias para ti</div>
          <div class="right">Ver todas</div>
        </div>
        <div class="user-pro sugges">
          <div class="left-side">
            <img
              style="height: 35px; width: 35px"
              class="suggestion-photo"
              src="https://s1.eestatic.com/2020/06/30/curiosidades/mascotas/mascotas_501711745_154816138_1706x960.jpg"
            />
            <div class="names">
              <h1>sugerencia</h1>
            </div>
          </div>
          <p>Seguir</p>
        </div>
        <div class="user-pro sugges">
          <div class="left-side">
            <img
              style="height: 35px; width: 35px"
              class="suggestion-photo"
              src="https://okdiario.com/img/2019/11/25/-que-nos-dice-el-perro-con-los-movimientos-de-su-cola_.jpg"
            />
            <div class="names">
              <h1>sugerencia</h1>
            </div>
          </div>
          <p>Seguir</p>
        </div>
        <div class="user-pro sugges">
          <div class="left-side">
            <img
              style="height: 35px; width: 35px"
              class="suggestion-photo"
              src="https://urgenciesveterinaries.com/wp-content/uploads/2020/01/hipotiroidismo-perros-01.jpg"
            />
            <div class="names">
              <h1>sugerencia</h1>
            </div>
          </div>
          <p>Seguir</p>
        </div>
        <div class="user-pro sugges">
          <div class="left-side">
            <img
              style="height: 35px; width: 35px"
              class="suggestion-photo"
              src="https://t1.ea.ltmcdn.com/es/images/5/0/2/img_las_10_razas_de_perros_mas_populares_del_mundo_23205_orig.jpg"
            />
            <div class="names">
              <h1>sugerencia</h1>
            </div>
          </div>
          <p>Seguir</p>
        </div>
        <div class="user-pro sugges">
          <div class="left-side">
            <img
              style="height: 35px; width: 35px"
              class="suggestion-photo"
              src="https://dam.ngenespanol.com/wp-content/uploads/2019/06/mirada-perros.png"
            />
            <div class="names">
              <h1>sugerencia</h1>
            </div>
          </div>
          <p>Seguir</p>
        </div>
        <div class="user-pro sugges">
          <div class="left-side">
            <img
              style="height: 35px; width: 35px"
              class="suggestion-photo"
              src="https://t1.ea.ltmcdn.com/es/images/9/6/1/como_piensan_los_perros_7169_orig.jpg"
            />
            <div class="names">
              <h1>sugerencia</h1>
            </div>
          </div>
          <p>Seguir</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import ModalComponent from "@/components/ModalComponent";
import ModalContentNotImplemented from "@/components/ModalContentNotImplemented";
import { Modal } from "bootstrap";
export default {
  name: "Feed-View",
  components: { ModalContentNotImplemented, ModalComponent },
  data() {
    return {
      posts: [],
      post: {
        title: "",
        content: "",
      },
    };
  },
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

body {
  width: 100%;
  min-width: 1920px;
  max-width: 1080px;
  background: linear-gradient(to bottom, #abdbdd 0%, #f5f5f5 20%) no-repeat
    center center fixed;
}

nav {
  position: fixed;
  width: 100%;
  z-index: 1;
  border-bottom: solid #dbdbdb 1px;
  background: linear-gradient(to bottom, #abdbdd 0%, #f5f5f5 20%) no-repeat
    center center fixed;
}

.nav-cont {
  font-size: 25px;
  font-weight: 500;
  color: #ffff;
  width: 50%;
  margin: auto;
  display: flex;
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
  align-items: center;
  padding: 5px;
  background: rgba(238, 244, 250, 0.67);
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 6px;
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
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}

.home {
  cursor: pointer;
}

.plus {
  cursor: pointer;
}

.heart {
  cursor: pointer;
}

.container {
  margin: auto;
}

.user-day {
  width: 614px;
  height: 118px;
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  background-color: white;
}

.day img {
  height: 56px;
  width: 56px;
  border-radius: 56px;
}

.day {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 80px;
}

.day p {
  font-size: 10px;
  color: rgb(51, 51, 51);
  margin-top: 10px;
  letter-spacing: 0.01em;
  max-width: 74px;
}

.fake {
  height: 62px;
  width: 62px;
  border-radius: 62px;
  border: 2px solid red;
  display: flex;
  justify-content: center;
  align-items: center;
}

.single-user {
  width: 614px;
  margin-top: 40px;
  margin-right: 40px;
}

.post-nav {
  background: #fff;
}

.single-user .post-nav {
  display: flex;
  justify-content: space-between;
  width: 100%;
  height: 60px;
  align-items: center;
}

.single-user .post-nav img {
  height: 32px;
  width: 32px;
  border-radius: 32px;
  margin-left: 15px;
}

.dotdot p {
  height: 3px;
  width: 3px;
  border-radius: 3px;
  background-color: rgb(31, 31, 31);
  margin-right: 3px;
}

.dotdot {
  display: flex;
  margin-right: 15px;
  cursor: pointer;
  height: 20px;
  align-items: center;
}

.post-nav .user-pro {
  display: flex;
  align-items: center;
}

.post-nav .user-pro p {
  margin-left: 10px;
  font-size: 14px;
  text-transform: lowercase;
}

.post-picture {
  width: 100%;
}

.post-picture img {
  width: 100%;
}

.footer {
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 100%;
  height: 60px;
}

.footer svg {
  margin-left: 15px;
  stroke: black;
}

.right-side {
  margin-right: 15px;
}

.liked-by {
  display: flex;
  margin-left: 15px;
}

.liked-by img {
  height: 20px;
  width: 20px;
  border-radius: 20px;
}

.liked-by p {
  margin-left: 10px;
  font-size: 14px;
}

.post-text {
  font-size: 14px;
  margin-top: 10px;
  padding-left: 15px;
}

.post-text {
  font-weight: 300;
}

.hours-ago {
  color: rgba(128, 128, 128, 0.602);
  margin-left: 15px;
  margin-top: 10px;
  text-transform: uppercase;
  font-size: 12px;
  padding-bottom: 20px;
}

.main-x {
  display: flex;
  margin-left: 60px;
}

.main-nav {
  width: 320px;
  overflow: hidden;
}

.user-pro img {
  object-fit: cover;
  height: 56px;
  width: 56px;
  border-radius: 65px;
}

.user-pro {
  display: flex;
  width: 100%;
  justify-content: space-between;
  margin-left: 0px;
  margin-top: 2rem;
  align-items: center;
}

.user-profile {
  display: flex;
  width: 26%;
  justify-content: space-between;
  margin-left: 2px;
  align-items: center;
}

.user-pro .left-side {
  display: flex;
  align-items: center;
}

.user-pro .left-side .names h1 {
  font-size: 14px;
  text-transform: lowercase;
  font-weight: 400;
}

.user-pro .left-side .names h2 {
  font-size: 12px;
  color: rgb(144, 144, 144);
  font-weight: 300;
}

.user-pro .left-side .names {
  margin-left: 15px;
}

.user-pro .button {
  background-color: none;
  outline: none;
  border: none;
  background-color: transparent;
  color: rgb(0, 153, 255);
}

.user-pro p {
  color: rgb(0, 119, 255);
  cursor: pointer;
  font-weight: 300;
}

.suggestions {
  display: flex;
  justify-content: space-between;
  margin-top: 20px;
  margin-left: 20px;
}

.suggestions .left {
  font-size: 14px;
  color: rgb(141, 141, 141);
}

.suggestions .right {
  font-size: 14px;
  color: rgb(51, 51, 51);
}

.suggestions .suggestion-photo {
  height: 32px;
  width: 32px;
}

.sugges {
  margin-top: 20px;
}

.icons {
  display: flex;
  flex-wrap: nowrap;
  flex-direction: row;
}
.icons * {
  flex-wrap: nowrap;
  padding: 0 0.3rem;
}
</style>
