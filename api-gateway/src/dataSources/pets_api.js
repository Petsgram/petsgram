const {RESTDataSource} = require('apollo-datasource-rest');
const serverConfig = require('../server');

class PetsAPI extends RESTDataSource {
  constructor() {
    super();
    this.baseURL = serverConfig.pets_api_url;
  }

  async addPet(pet) {
    return await this.post('/pets', JSON.parse(JSON.stringify(pet)));
  }

  async updatePet(pet) {
    return await this.put(`/pets`, JSON.parse(JSON.stringify(pet)));
  }

  async getPetByUsername(username) {
    return await this.get(`/pets/${username}`);
  }

  async getPetsByOwner(owner) {
    return await this.get(`/pets/my/${owner}`);
  }

  async getPetPicture(username) {
    return await this.get(`/pets/${username}/profile-pic`);
  }

  async deletePet(username) {
    return await this.delete(`/pets`, JSON.parse(JSON.stringify({username: username})));
  }
}

module.exports = PetsAPI;