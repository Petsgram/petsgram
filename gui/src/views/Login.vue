<template>
  <header>
    <h1>Petsgram</h1>
  </header>
  <main>
    <aside id="picture">
      <section class="image">
        <div class="text">
          Tus <b class="resalt">mascotas</b>,
          mas conectadas que nunca.
        </div>
        <section class="logo">
          <img class="logo-pic" src="../assets/logo/logo_without_background.png" alt="logo">
        </section>
        <img class="login-pets" src="../assets/images/login-pets.jpg" alt="Pets">
      </section>
    </aside>
    <section class="login">
      <form>
        <div class="form-group">
          <label for="email">Correo electrónico</label>
          <input type="email" id="email" class="form-control" placeholder="Ingresa tu correo electrónico">
        </div>
        <div class="form-group">
          <label for="password">Contraseña</label>
          <input type="password" id="password" class="form-control" placeholder="Ingresa tu contraseña">
        </div>
        <div class="form-group">
          <button type="submit" class="btn btnLogin">Login</button>
          <button class="btn btnRegister">Register</button>
        </div>
        <div class="remember-password">
          <p class="remember"> Recordar Contraseñas</p>
        </div>
      </form>
    </section>
  </main>
</template>

<script>
export default {
  name: "Login"
}
</script>

<style scoped lang="scss">
  *{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  header{
    color: #1D3557;
    font-family: "Averia Libre", cursive;
    font-weight: bold;
    text-align: center;
    padding: 2rem;
  }

  main{
    justify-content: center;
    display: flex;
    align-content: center;
    align-items: center;

    #picture, .login{
      background: white;
      width: 45%;
      margin: 1rem;
      padding: .5rem;
      height: 60vh;
      border-radius: 1rem;
      box-shadow: 0 20px 20px -1px #c4c4c488;
      position: relative;
      overflow: hidden;
    }

    .login{
      max-width: 20rem;
    }

    #picture{
      max-width: 40rem;
    }

    .image{
      object-fit: cover;
      .logo{
        z-index: 2;
        position: absolute;
        bottom: 0;
        right: 0;
        width: 20%;
        margin: .5em;
        height: 3.6rem;
        .logo-pic{
          width: 100%;
          height: 100%;
          object-fit: scale-down;
        }
      }

      .text {
        position: absolute;
        z-index: 2;
        bottom: 0;
        left: 0;
        width: 80%;
        padding: 1rem;
        color: #1D3557;
        font-weight: 800;
        font-family: "Poppins",serif;
        text-wrap: avoid;
        b{
          font-weight: 800;
          color: #457B9D;
        }
      }

      .login-pets{
        object-fit: cover;
        width: 100%;
        position: absolute;
        height: 100%;
        top: 0;
        left: 0;
        z-index: 0;

      }
      &::after{
        content: "";
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: linear-gradient(to bottom, #EDF3F900 70%,#EDF3F9 100%);
        z-index: 1;
      }
    }
  }
</style>