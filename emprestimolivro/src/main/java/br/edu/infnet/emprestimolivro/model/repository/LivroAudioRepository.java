package br.edu.infnet.emprestimolivro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.emprestimolivro.model.domain.AudioBook;

@Repository
public interface LivroAudioRepository extends CrudRepository<AudioBook, Integer>{

    @Query("from AudioBook a where a.usuario.id = :idUsuario")
    Collection<AudioBook> findAll(Integer idUsuario);
    
}
