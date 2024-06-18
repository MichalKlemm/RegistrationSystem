package org.example.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")

public class LoginController {
    @Value("${engeto.default.pw}")
    private String DEFAULT_PASSWORD;
    private boolean checkPassword(String userPassword){
        return userPassword.equals(DEFAULT_PASSWORD);
    }

    @PostMapping("v1/login")
    public String isPossibleToLogin(
            @RequestBody String password
    ){
        if (checkPassword(password)){
            return "Jsem prihlasen";
        }else {
            return "Nejsem prihlasen";
        }
    }

}
