const {gql} = require('apollo-server');

const like_type_defs = gql`
  type Like {
    id: ID!
    pet: Pet!
    post: Post!
    date:String!
  }

  input LikeInput {
    petId: ID!
    postId: ID!
  }

  extend type Mutation {
    addLike(input: LikeInput!): Like!
    removeLike(id: LikeInput): Like!
  }
    
`;
module.exports = like_type_defs;