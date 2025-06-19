package com.sistema_venta_06.grupo06.repository;

import com.sistema_venta_06.grupo06.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByNombre(Rol.NombreRol nombre);

    // Puedes agregar más métodos personalizados si es necesario
}
