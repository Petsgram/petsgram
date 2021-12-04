const {gql} = require('apollo-server');

const post_type_defs = gql`
  type Post {
    id: String!
    username: String!
    description: String!
    date: String!
    comments: [Comment]
    likes: [Like]
    image: String
  }

  input PostInput {
    username: ID!
    description: String!
    image: String
  }

  input PostWithImageInput {
    post: PostInput!
    image:String
  }

  extend type Query {
    getPosts: [Post]
    getPostByUsername(username: String!): [Post]!
    getPostById(id: String!): Post
  }

  extend type Mutation {
    createPostJSON(postInput: PostInput): Post
    createPostImage(postWithImageInput: PostWithImageInput): Post
  }

`;
module.exports = post_type_defs;