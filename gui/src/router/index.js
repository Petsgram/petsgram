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
    path: "/modal",
    name: "Modal",
    component: () => import("../components/ModalContentCreatePet"),
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
