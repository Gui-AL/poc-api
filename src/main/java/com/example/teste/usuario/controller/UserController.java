package com.example.teste.usuario.controller;

import com.example.teste.usuario.UserListDTO;
import com.example.teste.usuario.model.User;
import com.example.teste.usuario.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/listar")
    public ResponseEntity<List<User>> listarUsuarioPorStatusENome(@Valid @RequestBody UserListDTO userListDTO) throws JsonProcessingException {
        List<User> user = this.userService.listar(userListDTO);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<User>> listarTodos() {
        List<User> userList = this.userService.findAll();
        return ResponseEntity.ok().body(userList);
    }
}
