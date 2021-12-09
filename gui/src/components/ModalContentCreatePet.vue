<template>
  <div class="container-md">
    <div class="container-content">
      <div class="container-title">
        <h2>{{ title }}</h2>
      </div>
      <div class="container-fields">
        <!-- Crear campos (subir foto, username, nombres, fecha de nacimiento, tipo, raza) -->
        <div class="container-group foto-cc">
          <div class="container-field">
            <label class="foto-lbl" for="photo">Foto</label>
            <input
              type="file"
              name="photo"
              id="photo"
              v-on:change="onFileChange"
            />
          </div>
          <div class="container-field">
            <label for="username">Nombre de usuario</label>
            <input
              type="text"
              name="username"
              id="username"
              v-model="pet.username"
            />
          </div>
        </div>
        <div class="container-group">
          <div class="container-field">
            <label for="name">Nombres</label>
            <input type="text" name="name" id="name" v-model="pet.name" />
          </div>
          <div class="container-field">
            <label for="birthdate">Fecha de nacimiento</label>
            <input
              type="date"
              name="birthdate"
              id="birthdate"
              v-model="pet.birthdate"
            />
          </div>
        </div>
        <div class="container-group">
          <div class="container-field">
            <label for="type">Tipo</label>
            <select name="type" id="type" v-model="pet.typePet">
              <option value="" disabled>Seleccione un tipo</option>
              <option :key="type" v-for="type in types" :value="type.id">
                {{ type }}
              </option>
            </select>
          </div>
          <div class="container-field">
            <label for="breed">Raza</label>
            <input id="breed" type="text" v-model="pet.breed" />
          </div>
        </div>
        <!-- Botón para crear -->
        <div class="container-field-btn">
          <button class="btn-primary" v-on:click="createPet">Agregar</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ModalContentCreatePet",
  props: ["username"],
  data() {
    return {
      pet: {
        image: null,
        username: "",
        name: "",
        birthdate: "",
        typePet: "DOG",
        breed: "",
      },
      types: ["DOG", "CAT", "BIRD", "RABBIT", "OTHER"],
      breeds: [],
      title: "Registrar Nueva Macota",
    };
  },
  methods: {
    onFileChange(e) {
      console.log(e);
      this.pet.image = e.target.files[0];
    },
    createPet: function () {
      const formData = new FormData();
      formData.append("image", this.pet.image);
      formData.append("username", this.pet.username);
      formData.append("name", this.pet.name);
      formData.append("birthdate", this.pet.birthdate);
      formData.append("type", this.pet.typePet);
      formData.append("breed", this.pet.breed);
      formData.append("usernameOwner", this.$props.username);
      let a = formData.entries();
      for (let pair of a) {
        console.log(pair[0] + ": " + pair[1]);
      }
      console.log(this.pet);
      this.$emit("createPet", formData);
    },
  },
};
</script>

<style scoped lang="scss">
* {
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}

.container-title {
  display: flex;
  justify-content: center;
  align-items: center;
  color: #1d3557;
  font-family: Poppins, sans-serif;
}

.container-md {
  margin-bottom: 1rem;
  position: relative;
}

.container-content {
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding: 1rem;
}

.container-fields {
  margin: 1rem;
  display: flex;
  width: 25rem;
  flex-wrap: wrap;
  align-items: center;
  justify-content: center;

  .container-group {
    display: flex;
    flex-direction: row;
    width: 100%;
  }
}

.container-field {
  display: flex;
  flex-direction: column;
  margin: 1em 0;
  width: 100%;
  background: transparent;

  input[type="text"],
  input[type="date"],
  input[type="file"],
  select {
    background: transparent;
    border: 1px solid #457b9d;
    border-radius: 0.5rem;
    height: 2rem;
    color: #1d3557;
  }
}

.foto-cc {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  flex-wrap: wrap;

  #photo {
    display: flex;
    width: 100%;
    border: none;
    border-radius: 0;
    overflow: hidden;
    object-fit: cover;
  }
}

label {
  font-size: 0.7rem;
  color: #457b9d;
}

button {
  background: #457b9d;
  border: none;
  border-radius: 0.5rem;
  color: #fff;
  width: 10rem;
  font-size: 0.8rem;
  padding: 0.5rem 1rem;
  cursor: pointer;
}
</style>
