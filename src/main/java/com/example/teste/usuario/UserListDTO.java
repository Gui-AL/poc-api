package com.example.teste.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class UserListDTO {

    @Size(min = 2, max = 50, message = "Nome entre 2 a 50 caracteres")
    private String nome;

    @NotBlank(message = "Status nao pode ser vazio")
    @Size(min = 1, max = 1, message = "Status deve ser 'S' ou 'N'")
    private String ativo;

    public Map<String, Object> asParams() {
        return new HashMap<>() {{
            put("nome", nome == null ? "" : nome);
            put("ativo", ativo);
        }};
    }
}
