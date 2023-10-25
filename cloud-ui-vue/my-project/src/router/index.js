import Vue from "vue";
import Router from "vue-router";
import Login from "@/components/Login";
import Detail from "@/components/Detail";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: "/",
      name: "login",
      component: Login
    },
    {
      path: "/detail",
      name: "detail",
      component: Detail
    }
  ]
});