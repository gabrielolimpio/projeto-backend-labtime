package com.backendlabtime.projeto.repository;

import com.backendlabtime.projeto.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByNomeCompleto(String fullName);

    //List<Usuario> findByNomeSocialContendo(String socialName);

    //List<Usuario> findByEmailContendo(String email);
}
