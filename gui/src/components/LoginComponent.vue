<template>
  <section class="login">
    <h2 class="login-text">LogIn</h2>
    <form v-on:submit.prevent="processLogInUser">
      <div class="form-group">
        <label class="form-label" for="email">Correo electrónico</label>
        <input
          id="email"
          class="form-control-a"
          placeholder="Ingresa tu correo electrónico"
          type="email"
          v-model="user.email"
        />
      </div>
      <div class="form-group">
        <label class="form-label" for="password">Contraseña</label>
        <input
          id="password"
          class="form-control-a"
          placeholder="Ingresa tu contraseña"
          type="password"
          v-model="user.password"
        />
      </div>
      <div class="form-group">
        <button class="btn btnLogin" type="submit">Login</button>
        <button class="btn btnRegister" v-on:click="pushToRegister">
          Register
        </button>
      </div>
      <div class="remember-password">
        <p class="remember">Recordar Contraseñas</p>
      </div>
    </form>
  </section>
</template>

<script>
import gql from "graphql-tag";
export default {
  first_name: "LoginComponent",
  data() {
    return {
      user: {
        email: "",
        password: "",
      },
    };
  },
  methods: {
    processLogInUser: function () {
      this.$apollo
        .mutate({
          mutation: gql`
            mutation LogIn($credentials: Credentials!) {
              login(credentials: $credentials) {
                access
                refresh
              }
            }
          `,
          variables: {
            credentials: this.user,
          },
        })
        .then((res) => {
          let data = {
            access: res.data.login.access,
            refresh: res.data.login.refresh,
          };
          localStorage.setItem("access_token", data.access);
          localStorage.setItem("refresh_token", data.refresh);
          console.log(res);
          this.$router.push("/");
          this.$emit("loggedIn", data);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    pushToRegister() {
      this.$router.push("/register");
    },
  },
};
</script>

<style scoped></style>
