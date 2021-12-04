const {ApolloServer} = require('apollo-server');

const typeDefs = require('./typeDefs');
const resolvers = require('./resolvers');
const AuthAPI = require('./datasources/auth_api');
const PetsAPI = require('./datasources/pets_api');
const PostAPI = require('./datasources/post_api');
const auth = require('./utils/auth');

const server = new ApolloServer({
  typeDefs,
  resolvers,
  dataSources: () => ({
    authAPI: new AuthAPI(),
    petsAPI: new PetsAPI(),
    postAPI: new PostAPI(),
  }),
  introspection: true,
  playground: true
});

server.listen(process.env.PORT || 4000).then(({url}) => {
  console.log(`🚀 Server ready at ${url}`);
});