package br.edu.infnet.emprestimolivro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.emprestimolivro.model.domain.LivroDigital;

@Repository
public interface LivroDigitalRepository extends CrudRepository<LivroDigital, Integer>{

    @Query("from LivroDigital l where l.usuario.id = :idUsuario")
    Collection<LivroDigital> findAll(Integer idUsuario);
    
}
