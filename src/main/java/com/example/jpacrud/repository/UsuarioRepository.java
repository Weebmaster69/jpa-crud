package com.example.jpacrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jpacrud.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    
}
