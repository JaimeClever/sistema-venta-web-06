package com.sistema_venta_06.grupo06.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private NombreRol nombre;

    public enum NombreRol {
        ADMIN, VENDEDOR
    }

    public Rol() {
    }

    public Rol(Long id, NombreRol nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NombreRol getNombre() {
        return nombre;
    }

    public void setNombre(NombreRol nombre) {
        this.nombre = nombre;
    }
}
