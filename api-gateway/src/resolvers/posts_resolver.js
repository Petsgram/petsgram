const postResolver = {
  Query: {
    getPosts: async (_, args, {dataSources}) => await dataSources.postAPI.getPosts(),
    getPostById: async (_, {id}, {dataSources}) => await dataSources.postAPI.getPostById(id),
    getPostByUsername: async (_, {username}, {dataSources}) => await dataSources.postAPI.getPostByUsername(username),
  },
  Mutation: {
    createPostJSON: async (_, {post}, {dataSources}) => await dataSources.postAPI.createPostJSON(post),
    createPostImage: async (_, {post}, {dataSources}) => await dataSources.postAPI.createPostImage(post),
    addLike: async (_, {like}, {dataSources}) => await dataSources.postAPI.addLike(like),
    removeLike: async (_, {like}, {dataSources}) => await dataSources.postAPI.removeLike(like),
    addComment: async (_, {comment}, {dataSources}) => await dataSources.postAPI.addComment(comment),
  }
}

module.exports = postResolver;