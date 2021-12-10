<template>
  <ModalComponent modal="modal-prevent">
    <ModalContentNotImplemented />
  </ModalComponent>
  <HeaderPetsgram />
  <main>
    <transition name="trans" appear>
      <PictureCredentials />
    </transition>
    <transition name="fade" appear>
      <LoginComponent />
    </transition>
  </main>
</template>

<script>
import LoginComponent from "../components/LoginComponent";
import PictureCredentials from "../components/PictureCredentials";
import HeaderPetsgram from "@/components/HeaderPetsgram";
import ModalComponent from "@/components/ModalComponent";
import ModalContentNotImplemented from "@/components/ModalContentNotImplemented";

export default {
  name: "Login-View",
  components: {
    ModalContentNotImplemented,
    ModalComponent,
    PictureCredentials,
    LoginComponent,
    HeaderPetsgram,
  },
  created() {
    document.title = "Login - Petsgram";
    if (localStorage.getItem("access_token")) {
      this.$router.push("/");
    }
  },
};
</script>

<style lang="scss">
@import "../assets/css/credentials";

.login {
  width: 15px;
}

.fade-enter-active {
  transition: all 0.2s;
}

.fade-enter-from,
.fade-leave-to {
  transform: scaleX(1.7);
}

.trans-enter-active {
  transition: all 0.2s;
}

.trans-enter-from,
.trans-leave-to {
  transform: translateX(-5rem);
}
</style>
