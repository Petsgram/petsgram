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
      <i class="arrow fas fa-arrow-left"></i>
      <p class="new-post"><b>Crea una nueva publicación</b></p>
      <p class="share"><b>Compartir</b></p>
    </div>
    <div class="content-post">
      <div class="content-image">
        <i class="image far fa-images"></i>
        <button class="file">Selecciona una foto</button>
      </div>

      <div class="content-features">
        <div class="content-description">
          <div class="profile-post">
            <img
              class="small-logo-post"
              src="https://i.pinimg.com/originals/19/45/94/194594e00cc5c5828004c61519e184b9.jpg"
              alt="fotoPerfil"
            />
            <div class="username">
              <p><b>olliethegoodest</b></p>
            </div>
          </div>

          <div class="description">
            <textarea class="textarea-description">
 Escribe una descripción...</textarea
            >
          </div>
          <footer class="footer-description">
            <i class="far fa-smile"></i>
            <div class="container-word-counter">
              <p class="word-counter">0/2,200</p>
            </div>
          </footer>
        </div>
        <div class="content-comments">
          <div class="header-comments">
            <p><b>Comentarios activados</b></p>
            <div class="container-toggle">
              <i class="fas fa-toggle-on"></i>
            </div>
          </div>
        </div>
      </div>
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
  left: 0;
  right: 0;
  bottom: 0;
  top: 0;
  margin: auto;
  width: 47.5%;
  height: 80%;
  background: #ffffff;
  border-radius: 30px;
  min-width: 265px;
}

.container-main {
  width: 1920px;
  height: 937px;
  background: rgba(0, 0, 0, 0.6);
}

.content-description {
  height: 50%;
  padding: 0.5rem;
  border-color: black;
  border-style: solid none none solid;
  min-height: 128px;
}

.content-comments {
  height: 50%;
  padding: 0.5rem;
  border-style: solid none none solid;
  border-color: black;
}

.fondo {
  background: rgba(0, 0, 0, 0.6);
}

.content-features {
  width: 40%;
  height: 100%;
}

.post {
  width: 100%;
  height: 10%;
  display: flex;
  flex-direction: horizontal;
  align-items: center;
  justify-content: center;
  gap: 2rem;
  justify-content: center;
  padding: 0 2rem 0 2rem;
}

.new-post {
  font-size: 1.2rem;
  width: 80%;
  text-align: center;
}

.share {
  font-size: 18px;
  color: #4eb5f7;
}

.arrow {
  font-size: 22px;
}

.file {
  font-size: 20px;
  border-radius: 10px;
  border: solid 3px #000000;
  background: transparent;
  justify-content: center;
}

.content-image {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 60%;
  height: 100%;
  border-style: solid none none none;
}

.content-post {
  width: 100%;
  height: 90%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.image {
  font-size: 12vw;
}

.username {
  font-size: 18px;
}

.small-logo-post {
  object-fit: cover;
  width: 27px;
  height: 25px;
  border-radius: 50%;
  cursor: pointer;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}

.profile-post {
  display: flex;
  flex-direction: horizontal;
  gap: 0.3rem;
}

.description {
  color: #adabab;
  font-size: 18px;
}

.textarea-description {
  border: none;
  resize: none;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  outline: none;
  width: 100%;
}

.footer-description {
  display: flex;
  flex-direction: row;
}

.container-word-counter {
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: flex-end;
}

.word-counter {
  font-size: 18px;
}

.header-comments {
  width: 100%;
  display: flex;
}

.header-comments p {
  width: 100%;
}

.container-toggle {
  display: flex;
  align-items: flex-end;
  flex-direction: column;
}

.fa-toggle-on {
  font-size: 28px;
}

.fa-smile {
  display: flex;
  align-items: center;
  justify-content: center;
}

@media only screen and (max-width: 900px) {
  .content-post {
    flex-direction: column;
  }

  .content-image {
    width: 100%;
  }

  .content-features {
    width: 100%;
  }

  .content-description {
    border: none;
    border-top: solid;
  }

  .content-comments {
    border: none;
    border-top: solid;
  }

  .new-post {
    font-size: 0.9rem;
  }

  .share {
    font-size: 0.8rem;
  }
}
</style>
