package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.LivroDigital;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.repository.LivroDigitalRepository;
import br.edu.infnet.emprestimolivro.model.tests.AppImpressao;

@Service
public class LivroDigitalService {
    
    @Autowired
    private LivroDigitalRepository livroDigitalRepository;

    public void incluirLivroDigital(LivroDigital livro) {
        livroDigitalRepository.save(livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
                + "' relizada com sucesso", livro);
    }

    public Collection<LivroDigital> obterLivrosDigital() {
        return (Collection<LivroDigital>) livroDigitalRepository.findAll();
    }

    public Collection<LivroDigital> obterLivrosDigital(Usuario usuario) {
        return (Collection<LivroDigital>) livroDigitalRepository.findAll(usuario.getId());
    }

    public void excluirLivro(Integer id) {
        livroDigitalRepository.deleteById(id);
    }

}
