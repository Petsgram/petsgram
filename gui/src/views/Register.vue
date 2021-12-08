<template>
  <main>
    <transition name="trans-pic" appear>
      <PictureCredentials />
    </transition>
    <transition name="appear" appear>
      <register-component />
    </transition>
  </main>
</template>
<script>
import RegisterComponent from "../components/RegisterComponent";
import PictureCredentials from "../components/PictureCredentials";

export default {
  name: "Register-View",
  components: { PictureCredentials, RegisterComponent },
  created: function () {
    document.title = "Register - Petsgram";
  },
};
</script>

<style lang="scss">
@import "../assets/css/credentials";

#picture {
  height: 70vh !important;
}

.appear-enter-active {
  transition: all 0.2s;
}

.appear-leave-active {
  transition: opacity 10s ease-in;
}

.appear-enter-from,
.appear-leave-to {
  transform: scaleX(0.7);
}

.trans-pic-enter-active {
  transition: all 0.2s;
}

.trans-pic-enter-from,
.trans-pic-leave-to {
  transform: translateX(5rem);
}
</style>
