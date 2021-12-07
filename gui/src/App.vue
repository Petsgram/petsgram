<template id="app">
  <HeaderPetsgram />
  <router-view></router-view>
</template>

<style lang="scss">
body {
  background: linear-gradient(to bottom, #abdbdd 0%, #f5f5f5 20%) no-repeat
    center center fixed;
}
</style>
<script>
import HeaderPetsgram from "./components/HeaderPetsgram";

export default {
  components: { HeaderPetsgram },
};
</script>
