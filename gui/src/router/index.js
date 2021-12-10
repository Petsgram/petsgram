import { createRouter, createWebHistory } from "vue-router";

const routes = [
  {
    path: "/",
    name: "Home",
    component: () => import("../views/Principal"),
  },
  {
    path: "/login",
    name: "Login",
    component: () => import("../views/Login"),
  },
  {
    path: "/register",
    name: "Register",
    component: () => import("../views/Register.vue"),
  },
  {
    path: "/profile",
    name: "Profile",
    component: () => import("../views/Profile.vue"),
  },
  {
    path: "/new-post",
    name: "NewPost",
    component: () => import("../views/NewPost.vue"),
  },
  {
    path: "/feed",
    name: "Feed",
    component: () => import("../views/Feed.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
