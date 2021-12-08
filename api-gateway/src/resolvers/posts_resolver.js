const postResolver = {
  Query: {
    getPosts: async (_, args, {dataSources}) => await dataSources.postAPI.getPosts(),
    getPostById: async (_, {id}, {dataSources}) => await dataSources.postAPI.getPostById(id),
    getPostByUsername: async (_, {username}, {dataSources}) => await dataSources.postAPI.getPostByUsername(username),
  },
  Mutation: {
    createPostJSON: async (_, {postInput}, {dataSources}) => await dataSources.postAPI.createPostJSON(postInput),
    createPostImage: async (_, {post}, {dataSources}) => await dataSources.postAPI.createPostImage(post),
    addLike: async (_, {input}, {dataSources}) => await dataSources.postAPI.addLike(input),
    removeLike: async (_, {id}, {dataSources}) => await dataSources.postAPI.removeLike(id),
    addComment: async (_, {input}, {dataSources}) => await dataSources.postAPI.addComment(input),
  }
}

module.exports = postResolver;