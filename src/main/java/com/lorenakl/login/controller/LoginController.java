package com.lorenakl.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    public ResponseEntity<String> info() {
        return ResponseEntity.ok("");
    } // 0, 100, 200, 300, 400, 500
    // 404 -> Cliente


    public ResponseEntity<String> login(String username, String password) {
        return ResponseEntity.ok("");
    }


}
