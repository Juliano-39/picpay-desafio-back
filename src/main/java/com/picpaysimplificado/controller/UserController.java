package com.picpaysimplificado.controller;

import com.picpaysimplificado.entities.dto.UserDto;
import com.picpaysimplificado.entities.model.User;
import com.picpaysimplificado.repository.UserRepository;
import com.picpaysimplificado.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;


    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto){

        var user = service.createUser(userDto);
        return ResponseEntity.ok().body(user);
    }
}
