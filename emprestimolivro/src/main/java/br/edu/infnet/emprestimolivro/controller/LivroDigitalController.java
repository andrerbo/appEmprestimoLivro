package br.edu.infnet.emprestimolivro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.model.domain.LivroDigital;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class LivroDigitalController {
    
    private static List<LivroDigital> livros = new ArrayList<LivroDigital>();


    public static void incluirLivroDigital(LivroDigital livro){
        livros.add(livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }


    @GetMapping(value = "/classes/livrodigital")
    public String getLivroDigitalPage(Model model){
        model.addAttribute("listagemLivroDigital", livros);
        return "/livrodigital/livrodigital";
    }
}
