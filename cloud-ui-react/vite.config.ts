import react from "@vitejs/plugin-react";
import { resolve } from "path";
import { defineConfig } from "vite";
import mkcert from "vite-plugin-mkcert";

let devProxyServer = "http://localhost:8081/";
if (process.env.DEV_PROXY_SERVER && process.env.DEV_PROXY_SERVER.length > 0) {
  console.log("Use devProxyServer from environment: ", process.env.DEV_PROXY_SERVER);
  devProxyServer = process.env.DEV_PROXY_SERVER;
}

// https://vitejs.dev/config/ mkcert()
export default defineConfig({
  plugins: [react()],
  server: {
    host: "0.0.0.0",
    port: 3001,
    proxy: {
      "^/api": {
        target: devProxyServer,
        xfwd: true,
      },
      "^/memos.api.v2": {
        target: devProxyServer,
        xfwd: true,
      },
      "^/o/": {
        target: devProxyServer,
        xfwd: true,
      },
      "^/u/.+/rss.xml": {
        target: devProxyServer,
        xfwd: true,
      },
      "^/explore/rss.xml": {
        target: devProxyServer,
        xfwd: true,
      },
    },
    // https: {
    //   cert: "/resources/localhost-443.pem",
    //   key: "/resources/localhost-443-key.peml",
    // },
  },
  resolve: {
    alias: {
      "@/": `${resolve(__dirname, "src")}/`,
    },
  },
});
