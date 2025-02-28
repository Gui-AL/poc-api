package com.example.teste.usuario.repository;

import com.example.teste.usuario.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM listar_usuarios_por_status_e_nome(:p_status, :p_nome)", nativeQuery = true)
    List<User> listarUsuariosPorStatusEParteDoNome(
            @Param("p_status") String status,
            @Param("p_nome") String nome
    );
}
