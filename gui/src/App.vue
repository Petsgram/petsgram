<template id="app">
  <router-view />
</template>

<style lang="scss">
body {
  background: linear-gradient(to bottom, #abdbdd 0%, #f5f5f5 20%) no-repeat
    center center fixed;
  width: 100vw;
  height: 100vh;
}
</style>
<script>
export default {
  created() {
    if (!localStorage.getItem("access_token")) {
      this.$router.push("/login");
    }
  },
};
</script>
