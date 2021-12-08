const usersResolver = {
  Query: {
    getUser: async (_, {id}, {dataSources}) => await dataSources.authAPI.getUser(id)
  },
  Mutation: {
    createUser: async (_, {user}, {dataSources}) => await dataSources.authAPI.createUser(user),
    login: async (_, {credentials}, {dataSources}) => await dataSources.authAPI.login(credentials),
    refreshToken: async (_, {refresh}, {dataSources}) => await dataSources.authAPI.refreshToken(refresh),
    updateUser: async (_, {user,id}, {dataSources}) => await dataSources.authAPI.updateUser(user, id)
  },
}

module.exports = usersResolver;