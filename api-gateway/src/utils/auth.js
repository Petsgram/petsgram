const {ApolloError} = require('apollo-server');
const serverConfig = require('../server');
const fetch = require('node-fetch');

const auth = async ({req}) => {
  const token = req.headers.authorization || '';

  if (token === '') return {userIdToken: null}
  else try {
    let requestOptions = {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        token
      })
    };

    const response = await fetch(`${serverConfig.auth_api_url}/verifyToken/`, requestOptions);
    if (response.status !== 200) throw new ApolloError('Invalid token: ' + response.status, 401);
    const json = await response.json();
    return {userIdToken: json.userId};
  } catch (e) {
    throw new ApolloError('Invalid token: ' + e, 500);
  }

}

module.exports = auth;