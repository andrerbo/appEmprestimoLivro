package br.edu.infnet.emprestimolivro.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.emprestimolivro.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

    @Query("from Usuario us where us.email = :email")
    List<Usuario> findByEmail(String email);
    
}
