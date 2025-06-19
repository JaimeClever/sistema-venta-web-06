package com.sistema_venta_06.grupo06.entity;

import jakarta.persistence.*;


import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "usuarios")

public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String nombres;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_roles",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();


    public Usuario(String username, String password, String nombres) {
        this.username = username;
        this.password = password;
        this.nombres = nombres;
    }
    public Usuario(Long id, String username, String password, String nombres) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombres = nombres;
    }
    public Usuario(String username, String password, String nombres, Set<Rol> roles) {
        this.username = username;
        this.password = password;
        this.nombres = nombres;
        this.roles = roles;
    }

    public Usuario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
}
