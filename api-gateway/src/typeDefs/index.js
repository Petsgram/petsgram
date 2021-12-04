const auth_type_defs = require('./auth_type_defs');
const comment_type_defs = require('./comment_type_defs');
const like_type_defs = require('./like_type_defs')
const post_type_defs = require('./post_type_defs')
const pet_type_defs = require('./pet_type_defs')

const typeDefs = [
  auth_type_defs,
  comment_type_defs,
  like_type_defs,
  post_type_defs,
  pet_type_defs
]

module.exports = typeDefs;