package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.AudioBook;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.repository.LivroAudioRepository;
import br.edu.infnet.emprestimolivro.model.tests.AppImpressao;

@Service
public class LivroAudioService {
    
    @Autowired
    private LivroAudioRepository livroAudioRepository;

    public void incluirAudiobook(AudioBook livro){
        livroAudioRepository.save(livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }

    public Collection<AudioBook> obterLivrosAudio(){
        return (Collection<AudioBook>) livroAudioRepository.findAll();
    }

    public Collection<AudioBook> obterLivrosAudio(Usuario usuario){
        return (Collection<AudioBook>) livroAudioRepository.findAll(usuario.getId());
    }

    public void excluirLivro(Integer id){
        livroAudioRepository.deleteById(id);
    }
    
}
