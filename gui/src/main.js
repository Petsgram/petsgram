import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import { ApolloClient, InMemoryCache, createHttpLink } from "@apollo/client";
import { setContext } from "apollo-link-context";
import { createApolloProvider } from "@vue/apollo-option";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";
import "./assets/css/global.css";

//server
const httpLink = createHttpLink({
  uri: "https://petsgram-apigt.herokuapp.com/",
});

//creacion del contexto
const authLink = setContext((_, { headers }) => {
  const token = localStorage.getItem("token");
  return {
    headers: {
      ...headers,
      authorization: token ? `Bearer ${token}` : "",
    },
  };
});

//creación del cliente
const client = new ApolloClient({
  link: authLink.concat(httpLink),
  cache: new InMemoryCache(),
});

//provider
const apolloProvider = createApolloProvider({
  defaultClient: client,
});

createApp(App).use(router).use(apolloProvider).mount("#app");
