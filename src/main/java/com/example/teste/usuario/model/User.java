package com.example.teste.usuario.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "usuario", name = "tb_usuario")
public class User {

    @Id
    @Column(name = "usr_id")
    private Integer id;

    @Column(name = "usr_nome")
    private String nome;

    @Column(name = "usr_ativo")
    private String ativo;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    @Column(name = "usr_dt_created_at")
    private LocalDateTime dataCriacao;
}
