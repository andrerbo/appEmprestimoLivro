package br.edu.infnet.emprestimolivro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.Livro;

@Service
public class LivroService {
    
    @Autowired
    private LivroAudioService livroAudioService;
    @Autowired
    private LivroDigitalService livroDigitalService;
    @Autowired
    private LivroFisicoService livroFisicoService;

    public List<Livro> obterLivros(){

        List<Livro> livros = new ArrayList<Livro>();

        livros.addAll(livroAudioService.obterLivrosAudio());
        livros.addAll(livroDigitalService.obterLivrosDigital());
        livros.addAll(livroFisicoService.obterLivrosFisicos());
        
        return livros;
    }
}
