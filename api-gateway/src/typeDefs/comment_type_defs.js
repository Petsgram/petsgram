const {gql} = require('apollo-server');

const comment_type_defs = gql`
  type Comment {
    id: String!
    comment: String!
    pet: Pet!
    post: Post!
  }

  input CommentInput {
    comment: String!
    id_post: String!
    id_user: String!
  }

  extend type Mutation {
    addComment(input: CommentInput!): Comment!
  }
`;

module.exports = comment_type_defs;