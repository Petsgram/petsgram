const authResolver = require('./auth_resolver');
const petsResolver = require('./pets_resolver');
const postsResolver = require('./posts_resolver');

const loadash = require('lodash');
const resolvers = loadash.merge(
  authResolver,
  petsResolver,
  postsResolver
);
module.exports = resolvers;