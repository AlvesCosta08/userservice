package com.codigoquatro.userservice.controller;

import com.codigoquatro.userservice.model.User;
import com.codigoquatro.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/users")
public class UserController {

    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User salvar(@RequestBody User user) {
        return userService.salvar(user);
    }
    
    @GetMapping
    public List<User> listar() {
        return userService.listar();
    }    

    
}
