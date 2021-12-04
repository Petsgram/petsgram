const usersResolver = {
  Query: {
    getUser: async (_, {id}, {dataSources}) => await dataSources.authAPI.getUser(id)
  },
  Mutation: {
    createUser: async (_, {signup}, {dataSources}) => await dataSources.authAPI.createUser(signup),
    login: async (_, {credentials}, {dataSources}) => await dataSources.authAPI.login(credentials),
    refreshToken: async (_, {refresh}, {dataSources}) => await dataSources.authAPI.refreshToken(refresh),
    updateUser: async (_, {update,id}, {dataSources}) => await dataSources.authAPI.updateUser(update, id)
  },
}

module.exports = usersResolver;