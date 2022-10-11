package br.edu.infnet.emprestimolivro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.emprestimolivro.model.domain.LivroFisico;

@Repository
public interface LivroFisicoRepository extends CrudRepository<LivroFisico, Integer>{
    
    @Query("from LivroFisico l where l.usuario.id = :idUsuario")
    Collection<LivroFisico> findAll(Integer idUsuario);
    
}
