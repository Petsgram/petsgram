<template>
  <section class="register">
    <h2 class="login-text">Register</h2>
    <form>
      <div class="form-group-fields">
        <div class="form-group-horizontal">
          <div class="form-group">
            <label class="form-label" for="username">Username</label>
            <input
              id="username"
              class="form-control-a"
              placeholder="Ingresa tu correo electrónico"
              type="text"
            />
          </div>
          <div class="form-group">
            <label class="form-label" for="email">Correo Electrónico</label>
            <input
              id="email"
              class="form-control-a"
              placeholder="Ingresa tu contraseña"
              type="email"
            />
          </div>
        </div>
        <div class="form-group-horizontal">
          <div class="form-group">
            <label class="form-label" for="password">Contraseña</label>
            <input
              id="password"
              class="form-control-a"
              placeholder="Ingresa tu correo electrónico"
              type="password"
            />
          </div>
          <div class="form-group">
            <label class="form-label" for="re-password"
              >Confirmar Contraseña</label
            >
            <input
              id="re-password"
              class="form-control-a"
              placeholder="Ingresa tu contraseña"
              type="password"
            />
          </div>
        </div>
        <div class="form-group-horizontal">
          <div class="form-group">
            <label class="form-label" for="name">Nombres</label>
            <input
              id="name"
              class="form-control-a"
              placeholder="Ingresa tu correo electrónico"
              type="text"
            />
          </div>
          <div class="form-group">
            <label class="form-label" for="surname">Apellidos</label>
            <input
              id="surname"
              class="form-control-a"
              placeholder="Ingresa tu contraseña"
              type="text"
            />
          </div>
        </div>
      </div>
      <div class="form-group btns">
        <button class="btn btnLogin" type="submit">login</button>
        <button class="btn btnRegister">Register</button>
      </div>
      <div class="remember-password">
        <p class="remember">Recordar Contraseña</p>
      </div>
    </form>
  </section>
</template>

<script>
export default {
  name: "loginComponent",
};
</script>

<style lang="scss">
@import "../assets/css/credentials";

.form-group-fields {
  display: flex;
  flex-direction: column;

  .form-group-horizontal {
    display: flex;
    flex-direction: row;

    .form-group {
      display: flex;
      flex-direction: column;
    }

    .form-control-a {
      width: auto;
    }
  }
}

.form-group {
  .btnRegister {
    width: 39%;
    background: #457b9d !important;
    color: #fff !important;
    margin-right: 1.1rem;
  }

  .btnLogin {
    width: 45% !important;
    background: #fff !important;
    color: #457b9d !important;
  }
}

@media (max-width: 700px) {
  .register {
    height: 100% !important;
    min-width: 80% !important;
  }
  .form-group-fields {
    .form-group-horizontal {
      flex-direction: column;

      .form-group {
        .form-control-a {
          width: 100% !important;
        }
      }
    }
  }

  .btns {
    display: flex !important;
    flex-direction: column-reverse !important;
    align-items: center;
    align-content: center;
    justify-content: center;
    position: relative;
    width: 100%;

    .btnLogin {
      transform: translateX(-2.1rem);
      width: 6rem !important;
    }

    .btnRegister {
      width: 6rem !important;
      position: relative !important;
    }
  }
}
</style>
