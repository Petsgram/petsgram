const {gql} = require('apollo-server');
const auth_type_defs = gql`
  type Tokens {
    refresh:String!
    access:String!
  }

  input Access {
    access:String!
  }

  input Credentials {
    email:String!
    password:String!
  }

  input UserInput {
    username:String!
    password:String!
    email:String!
    first_name:String!
    last_name:String!
    profile_pic:String
    birth_date:String!
  }

  type User {
    username:String!
    email:String!
    first_name:String!
    last_name:String!
    profile_pic:String!
    birth_date:String!
  }

  type Query {
    getUser(id:Int!):User!
  }

  type Mutation {
    createUser(signup:UserInput!):Tokens!
    login(credentials:Credentials!):Tokens!
    refreshToken(refresh:Access!):Tokens!
    updateUser(update:UserInput!):User!
  }

`;

module.exports = auth_type_defs;