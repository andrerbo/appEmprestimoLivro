package br.edu.infnet.emprestimolivro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.emprestimolivro.model.domain.Livro;

public interface LivroRepository extends CrudRepository<Livro, Integer>{

    @Query("from Livro l where l.usuario.id = :idUsuario")
    Collection<Livro> findAll(Integer idUsuario);

}
