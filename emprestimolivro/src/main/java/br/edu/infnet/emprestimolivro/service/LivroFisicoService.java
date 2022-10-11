package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.LivroFisico;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
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

    public Collection<LivroFisico> obterLivrosFisicos(Usuario usuario){
        return (Collection<LivroFisico>) livroFisicoRepository.findAll(usuario.getId());
    }

    public void excluirLivro(Integer id){
        livroFisicoRepository.deleteById(id);
    }
    
}
