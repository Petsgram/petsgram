module.exports = {
  auth_api_url: 'https://petsgram-auth.herokuapp.com',
  pets_api_url: 'https://petsgram-pets.herokuapp.com',
  post_api_url: 'https://petsgram-posts.herokuapp.com',
}

/*
* ROUTES
* -- Auth API --
* POST  /login                             [applications/json] {
*                                                               "email":"",
*                                                               "password":""
*                                                               }
*
* POST  /refresh                           [applications/json] {
*                                                               "refresh:":""
*                                                               }
*
* POST  /verifyToken                       [applications/json] {
*                                                               "token":""
*                                                               }
*
* GET   /user/:id
*
* POST  /user/create/                      [applications/json] {
*                                                               "username"    : "",
*                                                               "password"    : "",
*                                                               "email"       : "",
*                                                               "first_name"  : "",
*                                                               "last_name"   : "",
*                                                               "profile_pic" : null,
*                                                               "birth_date"  : null
*                                                               }
*
* PATCH /user/modify/:id                   [applications/json] {
*                                                               "username"    : "",
*                                                               "password"    : "",
*                                                               "email"       : "",
*                                                               "first_name"  : "",
*                                                               "last_name"   : "",
*                                                               "profile_pic" : null,
*                                                               "birth_date"  : null
*                                                               }
*
* -- Pets API --
*
* POST  /pets                              [form-data]         {
*                                                               "username":"",
*                                                               "name":"",
*                                                               "type":"",
*                                                               "breed":"",
*                                                               "birthdate":"",
*                                                               "usernameOwner":"",
*                                                               "image":null
*                                                               }
*
* PUT   /pets                              [application/json]  {
*                                                               "username":"",
*                                                               "name":"",
*                                                               "type":"",
*                                                               "breed":"",
*                                                               "birthdate":"",
*                                                               "usernameOwner":""
*                                                               }
*
* GET   /pets/:username
*
* GET   /pets/my/:usernameOwner
*
* GET   /pets/:username/profile-pic
*
* DELETE  /pets                            [application/json]  {
*                                                               "username":""
*                                                               }
*
* -- Posts API --
*
* POST  /posts                             [form-data]         {
*                                                               "username":"",
*                                                               "description":"",
*                                                               "image":image
*                                                               }
*
* POST  /posts                             [application/json]  {
*                                                               "username":"",
*                                                               "description":""
*                                                               }
*
* GET   /posts
*
* GET   /posts/:username
*
* GET   /posts/id/:id
*
* DELETE /posts                            [application/json]  {
*                                                               "postId":""
*                                                               }
*
* POST  /posts/like                        [application/json]  {
*                                                               "postId":"",
*                                                               "petId":""
*                                                               }
*
* POST  /posts/unlike                      [application/json]  {
*                                                               "postId":"",
*                                                               "petId":""
*                                                               }
*
* POST  /posts/comment                     [application/json]  {
*                                                               "id_post":"",
*                                                               "id_user":"",
*                                                               "comment":""
*                                                               }
*
*/
