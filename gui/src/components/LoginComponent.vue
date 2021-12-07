<template>
  <section class="login">
    <h2 class="login-text">LogIn</h2>
    <form>
      <div class="form-group">
        <label class="form-label" for="email">Correo electrónico</label>
        <input
          id="email"
          class="form-control-a"
          placeholder="Ingresa tu correo electrónico"
          type="email"
        />
      </div>
      <div class="form-group">
        <label class="form-label" for="password">Contraseña</label>
        <input
          id="password"
          class="form-control-a"
          placeholder="Ingresa tu contraseña"
          type="password"
        />
      </div>
      <div class="form-group">
        <button class="btn btnLogin" type="submit">Login</button>
        <button class="btn btnRegister">Register</button>
      </div>
      <div class="remember-password">
        <p class="remember">Recordar Contraseñas</p>
      </div>
    </form>
  </section>
</template>

<script>
export default {
  name: "LoginComponent",
};
</script>

<style scoped></style>
