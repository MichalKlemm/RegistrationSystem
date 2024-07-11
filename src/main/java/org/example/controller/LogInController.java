package org.example.controller;

import org.example.LogIn;
import org.example.service.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class LogInController {

    @Autowired
    private LogInService logInService;

    @PostMapping
    public LogIn createUser(@RequestBody LogIn logIn) {
        return logInService.createUser(logIn);
    }

    @GetMapping("/{id}")
    public LogIn getUserById(@PathVariable Long id) {
        return logInService.getUserById(id);
    }

    @GetMapping
    public List<LogIn> getAllUsers() {
        return logInService.getAllUsers();
    }

    @PutMapping
    public LogIn updateUser(@RequestBody LogIn logIn) {
        return logInService.updateUser(logIn);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        logInService.deleteUser(id);
    }
}

