<template>
    <div class="hello">
      <div class="page">
        <div class="container">
          <div class="right">
            <form class="form">
              <label for="email">Email</label>
              <input type="email" id="email" v-model="email" />
              <label for="password">Password</label>
              <input type="password" id="password" v-model="password" />
              <input type="submit" id="submit" value="Submit" @click="onSubmit" />
            </form>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: "Login",
    created() {},
    data() {
      let email = "";
      let password = "";
      return {
        email,
        password
      };
    },
    methods: {
      onSubmit: function() {
        console.log("点击提交", this.email, this.password);
        //TODO:调接口
        let loginResult = true; //假设登录成功，跳转到新页面
        if (loginResult) {
          this.$router.push({
            name: "detail",
            params: {
              //参数
            }
          });
        }
      }
    }
  };
  </script>
  <style scoped>
  .page {
    display: flex;
    flex-direction: column;
    height: 100%;
    position: absolute;
    place-content: center;
    width: 100%;
  }
  @media (max-width: 767px) {
    .page {
      height: auto;
      margin-bottom: 20px;
      padding-bottom: 20px;
    }
  }
  .container {
    display: flex;
    height: 320px;
    margin: 0 auto;
    width: 640px;
  }
  @media (max-width: 767px) {
    .container {
      flex-direction: column;
      height: 630px;
      width: 320px;
    }
  }
  .left {
    background: white;
    height: calc(100% - 40px);
    top: 20px;
    position: relative;
    width: 50%;
  }
  @media (max-width: 767px) {
    .left {
      height: 100%;
      left: 20px;
      width: calc(100% - 40px);
      max-height: 270px;
    }
  }
  .login {
    font-size: 50px;
    font-weight: 900;
    margin: 50px 40px 40px;
  }
  .eula {
    color: #999;
    font-size: 14px;
    line-height: 1.5;
    margin: 40px;
  }
  .right {
    background: #474a59;
    box-shadow: 0px 0px 40px 16px rgba(0, 0, 0, 0.22);
    color: #f1f1f2;
    position: relative;
    width: 50%;
  }
  @media (max-width: 767px) {
    .right {
      flex-shrink: 0;
      height: 100%;
      width: 100%;
      max-height: 350px;
    }
  }
  svg {
    position: absolute;
    width: 320px;
  }
  path {
    fill: none;
    stroke: #808084;
    stroke-width: 4;
  }
  .snake path {
    fill: none;
    stroke: #ebebee;
    stroke-width: 4;
    stroke-dasharray: 240 1386;
  }
  .form {
    margin: 40px;
    position: absolute;
  }
  label {
    color: #c2c2c5;
    display: block;
    font-size: 14px;
    margin-top: 20px;
    margin-bottom: 5px;
  }
  input {
    background: rgba(14, 14, 17, 0.25);
    border: 0;
    color: white;
    font-size: 20px;
    height: 30px;
    line-height: 30px;
    outline: none !important;
    width: 100%;
  }
  input::-moz-focus-inner {
    border: 0;
  }
  #submit {
    color: #707075;
    margin-top: 40px;
    transition: color 300ms;
  }
  #submit:focus {
    color: #f2f2f2;
  }
  #submit:active {
    color: #d0d0d2;
  }
  </style>