const {RESTDataSource} = require('apollo-datasource-rest');
const serverConfig = require('../server');

class AuthAPI extends RESTDataSource {
  constructor() {
    super();
    this.baseURL = serverConfig.auth_api_url;
  }

  async createUser(user) {
    user = await this.post('/users/create', JSON.parse(JSON.stringify(user)));
    return user;
  }

  async login(credentials) {
    credentials = await this.post('/login', JSON.parse(JSON.stringify(credentials)));
    return credentials;
  }

  async refreshToken(token) {
    token = await this.post('/refresh', JSON.parse(JSON.stringify({refresh: token})));
    return token;
  }

  async getUser(id) {
    console.log("aqui: " + id)
    const res =  await this.get(`/user/${id}`);
    console.log(res);
    return res;
  }

  async updateUser(user) {
    return await this.put(`/user/modify/${user.id}`, JSON.parse(JSON.stringify(user)));
  }
}

module.exports = AuthAPI;