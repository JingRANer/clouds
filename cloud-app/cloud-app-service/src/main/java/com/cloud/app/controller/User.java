package com.cloud.app.controller;

import lombok.Data;

@Data
public class User {
    String username;
    String password;
    Boolean remember;
    String data;
}
