<template>
  <main>
    <PictureCredentials />
    <LoginComponent />
  </main>
</template>

<script>
import LoginComponent from "../components/LoginComponent";
import PictureCredentials from "../components/PictureCredentials";

export default {
  name: "Login-View",
  components: { PictureCredentials, LoginComponent },
  created: function () {
    document.title = "Login - Petsgram";
  },
};
</script>

<style lang="scss">
@import "../assets/css/credentials";
</style>
