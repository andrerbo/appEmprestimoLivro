package br.edu.infnet.emprestimolivro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.model.domain.AudioBook;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class LivroAudioController {

    private static List<AudioBook> livros = new ArrayList<AudioBook>();


    public static void inclruiAudiobook(AudioBook livro){
        livros.add(livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }

    @GetMapping(value = "/classes/livroaudio")
    public String getLivroAudioLivroPage(Model model){
        model.addAttribute("listagemAudioLivro", livros);
        return "/livroaudio/livroaudio";
    }    
}
