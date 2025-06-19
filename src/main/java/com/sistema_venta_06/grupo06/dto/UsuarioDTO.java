package com.sistema_venta_06.grupo06.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioDTO {
    private String username;
    private String password;
    private String nombres;
}
