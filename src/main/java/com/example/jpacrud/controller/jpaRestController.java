package com.example.jpacrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpacrud.model.Usuario;
import com.example.jpacrud.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class jpaRestController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> getAllUser() {
        return usuarioService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getUserById (@PathVariable("id") long id){
        return usuarioService.getUserById(id);
    }

    @PostMapping("/save")
    public Usuario saveUser(@RequestBody Usuario u) {
        return usuarioService.saveUser(u);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUserById (@PathVariable("id") long id){

        return usuarioService.deleteById(id);
    }
}
