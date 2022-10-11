package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.Livro;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.repository.LivroRepository;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;

    public Collection<Livro> obterLivros(){  
        return (Collection<Livro>) livroRepository.findAll();
    }

    public Collection<Livro> obterLivros(Usuario usuario){  
        return (Collection<Livro>) livroRepository.findAll(usuario.getId());
    }

    public void excluirLivro(Integer id){
        livroRepository.deleteById(id);
    }

}
