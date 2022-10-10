package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.LivroFisico;
import br.edu.infnet.emprestimolivro.model.repository.LivroFisicoRepository;
import br.edu.infnet.emprestimolivro.model.tests.AppImpressao;

@Service
public class LivroFisicoService {

    @Autowired
    private LivroFisicoRepository livroFisicoRepository;

    public void incluirLivroFisico(LivroFisico livro){
        livroFisicoRepository.save(livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }

    public Collection<LivroFisico> obterLivrosFisicos(){
        return (Collection<LivroFisico>) livroFisicoRepository.findAll();
    }

    public void excluirLivro(Integer id){
        livroFisicoRepository.deleteById(id);
    }
    
}
