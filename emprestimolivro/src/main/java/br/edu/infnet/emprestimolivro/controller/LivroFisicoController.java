package br.edu.infnet.emprestimolivro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.model.domain.LivroFisico;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class LivroFisicoController {
    
    private static List<LivroFisico> livros = new ArrayList<LivroFisico>();


    public static void incluirLivroFisico(LivroFisico livro){
        livros.add(livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }

    @GetMapping(value = "/classes/livrofisico")
    public String getLivroFisicoPage(Model model){
        model.addAttribute("listagemLivrosFisicos", livros);
        return "/livrofisico/livrofisico";
    }
}
