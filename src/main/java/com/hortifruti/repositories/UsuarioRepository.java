package com.hortifruti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hortifruti.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
