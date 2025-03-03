package com.example.teste.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class UserListDTO {

    private String nome;

    @NotBlank(message = "Status não pode ser vazio")
    @Size(min = 1, max = 1, message = "Status deve ser 'S' ou 'N'")
    @Pattern(regexp = "^[SN]$", message = "Status deve ser 'S' para ativo ou 'N' para inativo")
    private String ativo;

    public Map<String, Object> asParams() {
        return new HashMap<>() {{
            put("nome", nome == null ? "" : nome);
            put("ativo", ativo);
        }};
    }
}
