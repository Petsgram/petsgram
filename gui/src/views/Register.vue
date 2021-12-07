<template>
  <main>
    <PictureCredentials />
    <register-component />
  </main>
</template>
<script>
import RegisterComponent from "../components/RegisterComponent";
import PictureCredentials from "../components/PictureCredentials";

export default {
  name: "Register-View",
  components: { PictureCredentials, RegisterComponent },
};
</script>

<style lang="scss" scoped>
@import "../assets/css/credentials";

#picture {
  height: 70vh !important;
}
</style>
