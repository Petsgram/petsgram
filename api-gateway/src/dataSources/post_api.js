const {RESTDataSource} = require('apollo-datasource-rest');
const serverConfig = require('../server')
const AuthAPI = require('./auth_api')
const {ApolloError} = require("apollo-server");

class PostAPI extends RESTDataSource {
  constructor(props) {
    super(props);
    this.baseURL = serverConfig.post_api_url;
  }

  async createPostJSON(post) {
    return await this.post('/posts', JSON.parse(JSON.stringify(post)));
  }

  async createPostImage(postWithImage) {
    return await this.post('/posts', JSON.parse(JSON.stringify(postWithImage)), {
      headers: {'Content-Type': 'multipart/form-data'},
    });
  }

  async getPosts() {
    const response = await this.get('/posts');
    console.log(response);
    return response
  }

  async getPostByUsername(username) {
    const res = await this.get(`/posts/${username}`);
    console.log("aqui")
    console.log(res);
    return res
  }

  async getPostById(id) {
    return await this.get(`/posts/id/${id}`);
  }

  async addLike(input) {
    const res = await this.post('/posts/like', JSON.parse(JSON.stringify(input)))
    const post = await this.getPostById(input.postId);
    const pet = await this.context.dataSources.petsAPI.getPetByUsername(input.petId)
    console.log(res);
    if (res === "Like already created") throw new ApolloError("You already liked this post", "ALREADY_LIKED")
    return {
      id: res.id,
      post: post,
      pet: pet,
      date: res.like_date,
    }
  }

  async removeLike(id) {
    const res =  await this.post('/posts/unlike', JSON.parse(JSON.stringify(id)));
    const post = await this.getPostById(id.postId);
    const pet = await this.context.dataSources.petsAPI.getPetByUsername(id.petId)
    console.log(res)
    if (res === "Like not found" || !res) throw new ApolloError("You didn't like this post", "NOT_LIKED")
    return {
      id: res.id,
      post: post,
      pet: pet,
      date: res.like_date,
    }
  }

  async addComment(commentInput) {
    const res = await this.post('/posts/comment', JSON.parse(JSON.stringify(commentInput)));
    const post = await this.getPostById(res.id_post)
    const user = await this.context.dataSources.petsAPI.getPetByUsername(res.id_user)
    return {
      id: res.id,
      comment: res.comment,
      user: user,
      post: post,
    }
  }

}

module.exports = PostAPI;