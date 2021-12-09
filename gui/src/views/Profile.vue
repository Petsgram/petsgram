<template>
  <nav>
    <div class="nav-cont">
      <p class="">Petsgram</p>
      <div class="cont-input">
        <i class="search fas fa-search"></i>
        <input type="text" placeholder="Buscar" />
      </div>
      <div class="iconos">
        <i class="home fas fa-home"></i>
        <i class="plus far fa-plus-square"></i>
        <i class="heart fas fa-heart"></i>
        <img
          class="small-logo"
          src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
          alt="fotoPerfil"
        />
      </div>
    </div>
  </nav>
  <header>
    <div class="perfil-container">
      <img
        class="img-perfil"
        src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
        alt="fotoPerfil"
      />
      <div class="contenedor-cabezera">
        <div class="cabezera1">
          <h1>olliethegoodest</h1>
          <button>Editar perfil</button>
          <i class="settings fas fa-cog"></i>
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
    <div class="mainCont__grid">
      <div>
        <img
          src="https://www.dogmal.com/wp-content/uploads/2017/02/Sheepadoodle-930x600.jpg"
          alt=""
        />
      </div>
      <div>
        <img
          src="https://i.pinimg.com/474x/14/87/32/1487321f9cb4166f66db77bf64d7baa9.jpg"
          alt=""
        />
      </div>
      <div>
        <img
          src="https://gfp-2a3tnpzj.stackpathdns.com/wp-content/uploads/2019/10/Duke4-600x600.jpg"
          alt=""
        />
      </div>
      <div>
        <img
          src="https://www.feathersandfleece.com/wp-content/uploads/2019/07/breeding-left.jpg"
          alt=""
        />
      </div>
      <div>
        <img
          src="https://texasdoodlesforsale.com/wp-content/uploads/elementor/thumbs/mini_sheepadoodle_puppy-p5o729jha7c3dxx2xyuqv0c303bx2clpd00wc453bs.jpg"
          alt=""
        />
      </div>
      <div>
        <img src="https://images.agreatertown.com/image3604528.jpg" alt="" />
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "Profile-View",
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
  min-width: 1920px;
  max-width: 1080px;
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
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}

.home {
  position: absolute;
  left: 65.5%;
  cursor: pointer;
}

.plus {
  position: absolute;
  left: 67.5%;
  cursor: pointer;
}

.heart {
  position: absolute;
  left: 69.3%;
  cursor: pointer;
}

header {
  width: 60%;
  margin: auto;
  transform: translateY(50px);
  padding: 20px 0;
}

.perfil-container {
  display: flex;
  margin-left: 250px;
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
  width: 70%;
  height: 1px;
  margin: auto;
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

.main {
  width: 70%;
  margin: auto;
  margin-top: 60px;
}

.mainCont__grid {
  margin-left: 310px;
  display: grid;
  grid-template-columns: repeat(3, 23%);
  grid-template-rows: repeat(5, auto);
  gap: 1%;
  height: auto;
}

.mainCont__grid div > img {
  object-fit: cover;
  width: 95%;
  height: 95%;
  cursor: pointer;
}
</style>
