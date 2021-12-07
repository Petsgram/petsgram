import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
// import { ApolloClient } from "@apollo/client";
// import { setContext } from "apollo-link-context";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";

createApp(App).use(router).use(store).mount("#app");
