<template>
  <!-- Start: Container -->
  <div class="container">
    <header>
      <span
        class="iconify user"
        data-icon="carbon:user-avatar-filled-alt"
        style="color: white"
      ></span>
    </header>
    <main>
      <!-- Start: Description -->
      <h1 class="title">Petsgram</h1>
      <p class="description">
        La red social donde tus mascotas <br />
        son las protagonistas
      </p>
      <!-- End: Description -->

      <h3 class="greet">Buenos dias {{}}!</h3>

      <!-- Start: Show off your pet -->
      <button class="boast">
        Presume a tu mascota...
        <div class="boast__icon">
          <span
            class="iconify camera"
            data-icon="ant-design:camera-filled"
            style="color: white"
          ></span>
          <p>subir</p>
        </div>
      </button>
      <!-- End: Show off your pet -->

      <!-- Start: Information about your pets -->
      <div class="pet">
        <h2>Tus mascotas</h2>
        <div class="pet__container">
          <div
            class="pet__container--item"
            v-for="item in variable"
            :key="item"
          >
            <img src="{{}}" alt="{{}}" />
            <p>{{}}</p>
          </div>
          <button class="pet__container--add">Agregar otra mascota</button>
        </div>
      </div>
      <!-- End: Information about your pets -->
    </main>
  </div>
  <!-- End: Container -->
</template>

<script>
export default {
  name: "Principal-View",
};
</script>

<style scoped>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

.container {
  height: 100vh;
}

header {
  align-items: center;
  display: flex;
  flex-direction: row-reverse;
  height: 50px;
}

main {
  align-items: center;
  display: flex;
  flex-direction: column;
}

.title {
  color: #1d3557;
  font-family: "Averia Libre", cursive;
  font-size: 38px;
  font-weight: bold;
}

.description {
  color: #457b9d;
  font-family: "Poppins", sans-serif;
  font-size: 12px;
  font-weight: 400;
  text-align: center;
}

.greet {
  color: #457b9d;
  font-family: "Poppins", sans-serif;
  font-size: 24px;
  font-weight: 500;
  margin: 50px 0;
}

.boast {
  align-items: center;
  background: linear-gradient(to bottom, #edf3f900 70%, #edf3f9 100%);
  border: none;
  border-radius: 3px;
  box-shadow: 0 20px 20px -1px #c4c4c488;
  display: flex;
  font-family: "Poppins", sans-serif;
  font-size: 12px;
  font-weight: 400;
  height: 50px;
  justify-content: space-between;
  margin-bottom: 50px;
  padding-left: 15px;
  text-align: left;
  width: 180px;
}

.boast__icon {
  color: #fff;
  background-color: #457b9d;
  border-radius: 3px;
  display: flex;
  flex-direction: column;
  font-family: "Poppins", sans-serif;
  font-size: 8px;
  font-weight: 400;
  height: 100%;
  text-align: center;
  width: 70px;
}

.pet {
  align-items: flex-start;
  display: flex;
  flex-direction: column;
}

h2 {
  color: #457b9d;
  font-family: "Poppins", sans-serif;
  font-size: 12px;
  font-weight: 400;
  margin-bottom: 30px;
}

.pet__container {
  display: flex;
}

.pet__container--item {
  margin-right: 20px;
}

img {
  border-radius: 25px;
  height: 100px;
  width: 100px;
}

.pet__container--item > p {
  font-family: "Averia Libre", cursive;
  font-size: 11px;
  font-weight: 400;
  text-align: center;
}

.pet__container--add {
  align-items: center;
  border: none;
  background: none;
  color: #457b9d;
  display: flex;
  font-family: "Poppins", sans-serif;
  font-size: 12px;
  font-weight: 400;
  height: 100px;
  text-align: center;
  width: 100px;
}

.camera {
  height: 80%;
  width: 100%;
}

.user {
  height: 35px;
  width: 100px;
}
</style>
