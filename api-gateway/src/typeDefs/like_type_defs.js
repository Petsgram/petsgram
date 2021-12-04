const {gql} = require('apollo-server');

const like_type_defs = gql`
  type Like {
    id: ID!
    user: User!
    post: Post!
  }

  input LikeInput {
    user: ID!
    post: ID!
  }

  extend type Mutation {
    addLike(input: LikeInput!): Like!
    removeLike(id: LikeInput): String!
  }
    
`;
module.exports = like_type_defs;