package org.example.controller;

import org.example.UuidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("v1")
public class UuidController {

    @Autowired
    UuidGenerator generate;

    @GetMapping("uuid")
    public UUID generateUuid(){
        return generate.generateUuid();
    }
}
