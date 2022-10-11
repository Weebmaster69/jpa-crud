package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import com.example.jpacrud.model.Usuario;


public interface UsuarioService {

    public List<Usuario> getAll();

    public Optional<Usuario> getUserById(long id);

    public Usuario saveUser (Usuario usuario);
    
    public boolean deleteById (long id);
    
}
