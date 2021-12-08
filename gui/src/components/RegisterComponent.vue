<template>
  <section class="register">
    <h2 class="login-text">Register</h2>
    <form v-on:submit.prevent="RegisterUser">
      <div class="form-group-fields">
        <div class="form-group-horizontal">
          <div class="form-group">
            <label class="form-label" for="username">Username</label>
            <input
              id="username"
              class="form-control-a"
              placeholder="Ingresa tu correo electrónico"
              type="text"
              v-model="user.username"
            />
          </div>
          <div class="form-group">
            <label class="form-label" for="email">Correo Electrónico</label>
            <input
              id="email"
              class="form-control-a"
              type="email"
              v-model="user.email"
            />
          </div>
        </div>
        <div class="form-group-horizontal">
          <div class="form-group">
            <label class="form-label" for="password">Contraseña</label>
            <input
              id="password"
              class="form-control-a"
              type="password"
              v-model="user.password"
            />
          </div>
          <div class="form-group">
            <label class="form-label" for="birthdate"
              >Fecha de nacimiento</label
            >
            <input
              id="birthdate"
              class="form-control-a"
              type="date"
              v-model="user.birth_date"
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
              v-model="user.first_name"
            />
          </div>
          <div class="form-group">
            <label class="form-label" for="surname">Apellidos</label>
            <input
              id="surname"
              class="form-control-a"
              placeholder="Ingresa tu contraseña"
              type="text"
              v-model="user.last_name"
            />
          </div>
        </div>
      </div>
      <div class="form-group btns">
        <button class="btn btnLogin" v-on:click="pushLogin">login</button>
        <button class="btn btnRegister" type="submit">Register</button>
      </div>
      <div class="remember-password">
        <p class="remember">Recordar Contraseña</p>
      </div>
    </form>
  </section>
</template>

<script>
import gql from "graphql-tag";

export default {
  name: "loginComponent",
  data() {
    return {
      user: {
        username: "",
        password: "",
        email: "",
        first_name: "",
        last_name: "",
        birth_date: "",
      },
    };
  },
  methods: {
    pushLogin: function () {
      this.$router.push("/login");
    },
    RegisterUser: function () {
      this.$apollo
        .mutate({
          mutation: gql`
            mutation Mutation($user: UserInput!) {
              createUser(user: $user) {
                refresh
                access
              }
            }
          `,
          variables: {
            user: this.user,
          },
        })
        .then((data) => {
          let dataUser = data.data.createUser;
          localStorage.setItem("access_token", data.data.createUser.access);
          localStorage.setItem("refresh_token", data.data.createUser.refresh);
          this.$router.push("/");
          this.$emit("register", dataUser);
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
</script>

<style lang="scss" scoped>
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
}
</style>
