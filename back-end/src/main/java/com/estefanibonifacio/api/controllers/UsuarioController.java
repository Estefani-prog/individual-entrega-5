package com.estefanibonifacio.api.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.estefanibonifacio.api.models.Usuario;
import com.estefanibonifacio.api.repositories.UsuarioRepository;
import com.estefanibonifacio.api.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController // função que faz com que a classe seja um controlador rest (crud mvc)
@RequestMapping("/usuarios") // url base para acessar os métodos
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Protocolos HTTP: Get, Post, Put, Delete 
    @GetMapping // método get
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @PostMapping("/criar")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
        return ResponseEntity.ok().body(usuario);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Usuario> edit(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario = usuarioService.edit(id, usuario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(usuario);
    }

    /*@PutMapping("/editar/{id}")
    public ResponseEntity<Usuario> edit(@PathVariable Long id,@RequestBody Usuario usuario) {
        Usuario userToEdit = usuarioService.findById(id);
        userToEdit.setNome(usuario.getNome());
        userToEdit.setEmail(usuario.getEmail());
        userToEdit.setSenha(usuario.getSenha());
        return ResponseEntity.ok().body(userToEdit);
    }*/

  /*@PostMapping("/excluir")
    public ResponseEntity<Usuario> delete(@RequestBody Usuario usuario) {
        Usuario userToDelete = usuarioService.findById(usuario);
        usuarioService.delete(userToDelete);
        return ResponseEntity.ok().body(userToDelete);
    }*/

}
