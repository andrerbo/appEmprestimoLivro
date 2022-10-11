package br.edu.infnet.emprestimolivro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.emprestimolivro.model.domain.Emprestimo;

@Repository
public interface EmprestimoRepository extends CrudRepository<Emprestimo, Integer>{

    @Query("from Emprestimo p where p.usuario.id = :idUsuario")
    Collection<Emprestimo> findAll(Integer idUsuario);
    
}
