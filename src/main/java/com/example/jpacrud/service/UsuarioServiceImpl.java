package com.example.jpacrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpacrud.model.Usuario;
import com.example.jpacrud.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    UsuarioRepository repository;

    @Override
    public List<Usuario> getAll() {
        return (List<Usuario>) repository.findAll();
    }

    @Override
    public Optional<Usuario> getUserById(long id) {
        return repository.findById(id);
    }

    @Override
    public Usuario saveUser(Usuario usuario) {
        return repository.save(usuario);
        
    }

    @Override
    public boolean deleteById(long id) {
        try{

            Optional<Usuario> u = getUserById(id);

            repository.delete(u.get());
            return true;

        }catch (Exception e) {
            return false;
        }
    }

    
    
}
