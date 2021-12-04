const petsResolver = {
  Query: {
    getPetByUsername: async (_, {username}, {dataSources}) => await dataSources.petsAPI.getPetByUsername(username),
    getPetsByOwner: async (_, {owner}, {dataSources}) => await dataSources.petsAPI.getPetsByOwner(owner),
    getPetPicture: async (_, {username}, {dataSources}) => await dataSources.petsAPI.getPetPicture(username),
  },
  Mutation: {
    addPet: async (_, {pet}, {dataSources}) => await dataSources.petsAPI.addPet(pet),
    updatePet: async (_, {pet}, {dataSources}) => await dataSources.petsAPI.updatePet(pet),
    deletePet: async (_, {username}, {dataSources}) => await dataSources.petsAPI.deletePet(username),
  }
}
module.exports = petsResolver;