const {gql} = require('apollo-server');

const pet_type_defs = gql`
  type Pet{
    username: String!
    name: String!
    type: String!
    breed: String!
    birthdate: String!
    usernameOwner: String!
    image: String
  }
  
  input PetInput{
    username: String!
    name: String!
    type: String!
    breed: String!
    birthdate: String!
    usernameOwner: String!
    image: String
  }
  
  extend type Query {
    getPetPicture(username: String!): String
    getPetByUsername(username: String!): Pet
    getPetsByOwner(owner: String!): [Pet]
  }
  
  extend type Mutation {
    addPet(pet: PetInput!): Pet
    updatePet(pet: PetInput!): Pet
    deletePet(username: String!): String
  }
  
`;

module.exports = pet_type_defs;