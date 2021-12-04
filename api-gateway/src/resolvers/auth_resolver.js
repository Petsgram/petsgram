const usersResolver = {
  Query: {
    getUser: async (_, {id}, {dataSources}) => await dataSources.authAPI.getUser(id)
  },
  Mutation: {
    createUser: async (_, {userInput}, {dataSources}) => await dataSources.authAPI.createUser(userInput),
    login: async (_, {credentials}, {dataSources}) => await dataSources.authAPI.login(credentials),
    refreshToken: async (_, {refresh}, {dataSources}) => await dataSources.authAPI.refreshToken(refresh),
    updateUser: async (_, {userInput}, {dataSources}) => await dataSources.authAPI.updateUser(userInput)
  },
}

module.exports = usersResolver;