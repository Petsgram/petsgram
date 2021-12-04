const {RESTDataSource} = require('apollo-datasource-rest');
const serverConfig = require('../server');

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
    const response =  await this.get('/posts');
    console.log(response);
    return response
  }

  async getPostByUsername(username) {
    return await this.get(`/posts/${username}`);
  }

  async getPostById(id) {
    return await this.get(`/posts/id/${id}`);
  }

  async addLike(likeInput) {
    return await this.post('/posts/like', JSON.parse(JSON.stringify(likeInput)));
  }

  async removeLike(likeInput) {
    return await this.post('/posts/unlike', JSON.parse(JSON.stringify(likeInput)));
  }

  async addComment(commentInput) {
    return await this.post('/posts/comment', JSON.parse(JSON.stringify(commentInput)));
  }

}

module.exports = PostAPI;