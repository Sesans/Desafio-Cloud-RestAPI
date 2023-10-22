package com.dio.desafiorestAPI.controller;

import com.dio.desafiorestAPI.models.User;
import com.dio.desafiorestAPI.repository.UserRepository;
import com.dio.desafiorestAPI.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class RestContoller {

    private final UserService userService;
    private final UserRepository userRepository;

    public RestContoller(UserService userService, UserRepository userRepository){
        this.userService = userService;
        this.userRepository = userRepository;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable Long id){
        var user = userRepository.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/list")
    public List<User> listarTodos(){
        return userRepository.findAll();
    }

    @PostMapping("/{id}")
    public ResponseEntity<User> create(@RequestBody User userToCreate){
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
