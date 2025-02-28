package com.example.teste.usuario.controller;

import com.example.teste.usuario.UserListDTO;
import com.example.teste.usuario.model.User;
import com.example.teste.usuario.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    @GetMapping("/listar")
    public ResponseEntity<List<User>> listarUsuarioPorStatusENome(@RequestBody UserListDTO userListDTO) throws JsonProcessingException {
        List<User> user = userService.listar(userListDTO);
        return ResponseEntity.ok().body(user);
    }
}
