package br.edu.infnet.emprestimolivro.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.emprestimolivro.model.domain.LivroFisico;

@Repository
public interface LivroFisicoRepository extends CrudRepository<LivroFisico, Integer>{
    
}
