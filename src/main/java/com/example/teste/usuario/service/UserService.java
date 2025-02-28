package com.example.teste.usuario.service;

import com.example.teste.usuario.UserListDTO;
import com.example.teste.usuario.model.User;
import com.example.teste.usuario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listar(UserListDTO userListDTO) {
        return this.userRepository.listarUsuariosPorStatusEParteDoNome(userListDTO.getAtivo(), userListDTO.getNome());
    }


}
