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
  
  input Signup {
    username:String!
    password:String!
    email:String!
    first_name:String!
    last_name:String!
    profile_pic:String!
    birth_date:String!
  }
  
  type User {
    id:Int!
    username:String!
    email:String!
    first_name:String!
    last_name:String!
    profile_pic:String!
    birth_date:String!
  }
  
  type Query {
    userById(id:Int!):User!
  }
  
  type Mutation {
    signup(signup:Signup):Tokens!
    login(credentials:Credentials):Tokens!
    refresh(refresh:Access!):Tokens!
  }
  
`;

module.exports = auth_type_defs;