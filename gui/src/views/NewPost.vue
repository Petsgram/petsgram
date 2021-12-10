<template>
  <div class="container-main">
    <nav>
      <div class="fondo">
        <div class="nav-cont">
          <p>Petsgram</p>
          <div class="cont-input">
            <i class="search fas fa-search"></i>
            <input type="text" placeholder="Buscar" />
          </div>
          <div class="iconos">
            <div class="fondoFoto"></div>
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
      </div>
    </nav>
  </div>
  <main>
    <div class="post">
      <div class="arrow-post">
        <i class="arrow fas fa-arrow-left"></i>
      </div>
      <p class="new-post"><b>Crea una nueva publicación</b></p>
      <p class="share"><b>Compartir</b></p>
    </div>
    <div class="up-line"></div>
    <div class="middle-line"></div>
    <div class="right-line"></div>
    <div class="username">
      <p><b>olliethegoodest</b></p>
    </div>
    <div class="profile-post">
      <img
        class="small-logo-post"
        src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
        alt="fotoPerfil"
      />
    </div>
    <div class="image-icon">
      <i class="image far fa-images"></i>
    </div>
    <button class="file">Selecciona una foto</button>
    <div class="description">
      <p>Escribe una descripción...</p>
    </div>
    <div class="emoji-icon">
      <i class="far fa-smile"></i>
    </div>
    <div class="word-counter">
      <p>0/2,200</p>
    </div>
    <div class="comments">
      <p><b>Comentarios activados</b></p>
    </div>
    <div class="comment-toggle">
      <i class="fas fa-toggle-on"></i>
    </div>
  </main>
</template>

<script>
export default {};
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
  border-bottom: solid rgba(0, 0, 0, 0.6) 1px;
  background: linear-gradient(to bottom, #abdbdd 0%, #f5f5f5 20%) no-repeat
    center center fixed;
}

.nav-cont {
  font-size: 25px;
  font-weight: 500;
  color: rgba(138, 137, 137, 0.99);
  width: 50%;
  margin: auto;
  display: flex;
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  justify-content: space-between;
  align-items: center;
  padding: 10px 50px;
}

.search {
  color: rgba(161, 159, 159, 0.25);
  font-size: 15px;
  height: 17px;
  margin-right: 5px;
}

.cont-input {
  height: 28px;
  display: flex;
  align-items: center;
  padding: 5px;
  background: rgba(161, 159, 159, 0.25);
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

.fondoFoto {
  position: fixed;
  width: 27px;
  height: 25px;
  border-radius: 50%;
  background: rgba(0, 0, 0, 0.6);
}

main {
  position: absolute;
  margin-left: 450px;
  width: 47.5%;
  height: 80%;
  left: 55px;
  top: 80px;
  background: #ffffff;
  border-radius: 30px;
}

.container-main {
  width: 1920px;
  height: 937px;
  background: rgba(0, 0, 0, 0.6);
}

.fondo {
  background: rgba(0, 0, 0, 0.6);
}

.post {
  width: 830px;
  height: 50px;
}

.new-post {
  font-size: 18px;
  margin-left: 42.5%;
  margin-top: 3px;
  width: 250px;
}

.share {
  font-size: 18px;
  width: 50px;
  margin-left: 95%;
  margin-top: -20px;
  color: #4eb5f7;
}

.arrow-post {
  position: relative;
  width: 70px;
  height: 20px;
}

.arrow {
  margin-left: 40px;
  margin-top: 25px;
  font-size: 22px;
}

.up-line {
  position: absolute;
  width: 912px;
  height: 0px;
  left: 0px;
  top: 65px;
  border: 2px solid #000000;
}

.middle-line {
  position: absolute;
  width: 684px;
  height: 0px;
  left: 230px;
  top: 408px;
  border: 2px solid #000000;
  transform: rotate(90deg);
}

.right-line {
  position: absolute;
  width: 342px;
  height: 0px;
  left: 570px;
  top: 420px;
  border: 2px solid #000000;
}

.file {
  font-size: 20px;
  margin-left: 210px;
  margin-top: 90px;
  height: 40px;
  width: 180px;
  border-radius: 10px;
  border: solid 3px #000000;
  background: transparent;
  justify-content: center;
}

.image-icon {
  height: 100px;
  width: 150px;
  margin-top: 150px;
  margin-left: 220px;
}

.image {
  font-size: 150px;
  height: 190px;
}

.username {
  margin-left: 630px;
  margin-top: 51px;
  height: 100px;
  font-size: 18px;
}

.small-logo-post {
  object-fit: cover;
  margin-left: 590px;
  width: 27px;
  height: 25px;
  border-radius: 50%;
  cursor: pointer;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}

.profile-post {
  margin-top: -100px;
}

.description {
  margin-left: 590px;
  margin-top: -350px;
  color: #adabab;
  font-size: 18px;
}

.emoji-icon {
  font-size: 30px;
  margin-left: 580px;
  margin-top: 198px;
}

.word-counter {
  font-size: 18px;
  margin-left: 840px;
  margin-top: -29px;
}

.comments {
  font-size: 18px;
  margin-left: 590px;
  margin-top: 40px;
}

.comment-toggle {
  margin-left: 860px;
  margin-top: -26px;
  font-size: 28px;
}
</style>
