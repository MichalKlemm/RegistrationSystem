package cz.engeto.Oasis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Oasis")
public class UserController {

    @GetMapping("api/v1/user/{ID}")
    public String getUserID(){
        return
    }
}
