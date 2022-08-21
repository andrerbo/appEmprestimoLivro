package br.edu.infnet.emprestimolivro.controller;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.AudioBook;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class LivroAudioController {

    // private static List<AudioBook> livros = new ArrayList<AudioBook>();
    private static Map<Integer, AudioBook> mapaLivroAudio = new HashMap<Integer, AudioBook>();
    private static Integer id = 1;


    public static void incluirAudiobook(AudioBook livro){
        // livros.add(livro);
        livro.setId(id++);
        mapaLivroAudio.put(livro.getId(), livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }

    public static Collection<AudioBook> obterLivrosAudio(){
        return mapaLivroAudio.values();
    }

    public static void excluirLivro(Integer id){
        mapaLivroAudio.remove(id);
    }

    @GetMapping(value = "/livroaudio/{id}/excluir")
    public String excluirLivroAudio(@PathVariable Integer id){
        excluirLivro(id);
        System.out.println("Exclusão do Livro Aúdio " + id + " realizada com sucesso");
        return "redirect:/livroaudio/lista";
    }

    @GetMapping(value = "/livroaudio/lista")
    public String getLivroAudioLivroPage(Model model){
        model.addAttribute("listagemAudioLivro", obterLivrosAudio());
        return "/livroaudio/lista";
    }    
}
