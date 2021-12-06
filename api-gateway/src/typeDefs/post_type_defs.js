const {gql} = require('apollo-server');

const post_type_defs = gql`
  type Post {
    id: String!
    username: String!
    description: String!
    date: String!
    comments: [Comment]
    likes: [Like]
    image: Image
  }
  
  type Image {
    url: String!
    id: String!
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
    createPostJSON(post: PostInput): Post
    createPostImage(post: PostWithImageInput): Post
  }

`;
module.exports = post_type_defs;