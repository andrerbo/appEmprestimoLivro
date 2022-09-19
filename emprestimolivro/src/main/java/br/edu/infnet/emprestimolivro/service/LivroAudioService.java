package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.AudioBook;
import br.edu.infnet.model.tests.AppImpressao;

@Service
public class LivroAudioService {
   
    // private static List<AudioBook> livros = new ArrayList<AudioBook>();
    private static Map<Integer, AudioBook> mapaLivroAudio = new HashMap<Integer, AudioBook>();
    private static Integer id = 1;

    public void incluirAudiobook(AudioBook livro){
        // livros.add(livro);
        livro.setId(id++);
        mapaLivroAudio.put(livro.getId(), livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }

    public Collection<AudioBook> obterLivrosAudio(){
        return mapaLivroAudio.values();
    }

    public void excluirLivro(Integer id){
        mapaLivroAudio.remove(id);
    }
    
}
