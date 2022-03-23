package com.estefanibonifacio.api.services;

import java.util.List;
import java.util.Optional;

import com.estefanibonifacio.api.models.Usuario;
import com.estefanibonifacio.api.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    //@Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @Transactional
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Transactional
    public Usuario findById(Long usuario) {
        Optional<Usuario> user = usuarioRepository.findById(usuario); 
    return user.orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    @Transactional
    public Usuario edit(Long id, Usuario usuario) {
        Usuario userToEdit = usuarioRepository.getOne(id); 

        userToEdit.setNome(usuario.getNome());
        userToEdit.setEmail(usuario.getEmail());
        userToEdit.setSenha(usuario.getSenha());

        userToEdit = usuarioRepository.save(userToEdit);

        return new Usuario(userToEdit);
    }


    /*@Transactional(readOnly = true)
    public void delete(Usuario userToDelete2) {
        Optional<Usuario> userToDelete = usuarioRepository.findById(userToDelete2);
        usuarioRepository.delete(userToDelete);
    }*/
}