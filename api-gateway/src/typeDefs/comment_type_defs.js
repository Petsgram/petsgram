const {gql} = require('apollo-server');

const comment_type_defs = gql`
  type Comment {
    id: String!
    comment: String!
    user: User!
    post: Post!
  }

  input CommentInput {
    comment: String!
    post: String!
    user: String!
  }
  
  extend type Mutation {
    addComment(input: CommentInput!): Comment!
  }
`;

module.exports = comment_type_defs;