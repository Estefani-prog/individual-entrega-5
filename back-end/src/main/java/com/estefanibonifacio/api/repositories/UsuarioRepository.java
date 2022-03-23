package com.estefanibonifacio.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.estefanibonifacio.api.models.Usuario;

@Repository                              // Classe, Tipo do primary key
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    /*void delete(Optional<Usuario> userToDelete);*/

}
