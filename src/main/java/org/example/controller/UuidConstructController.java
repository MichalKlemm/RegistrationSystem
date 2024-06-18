package org.example.controller;

import org.example.UuidGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("v2")
public class UuidConstructController {

    UuidGenerator uuidGenerator;

    public UuidConstructController(
            @Autowired UuidGenerator uuidGenerator
    ){
        this.uuidGenerator = uuidGenerator;
    }
    @GetMapping("uuid")
    public UUID generateUuid(){
        return uuidGenerator.generateUuid();
    }
}
