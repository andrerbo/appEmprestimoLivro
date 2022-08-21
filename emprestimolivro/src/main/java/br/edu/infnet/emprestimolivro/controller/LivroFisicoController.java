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

import br.edu.infnet.model.domain.LivroFisico;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class LivroFisicoController {
    
    // private static List<LivroFisico> livros = new ArrayList<LivroFisico>();
    private static Map<Integer, LivroFisico> mapaLivroFisico = new HashMap<Integer, LivroFisico>();
    private static Integer id = 1;


    public static void incluirLivroFisico(LivroFisico livro){
        // livros.add(livro);
        livro.setId(id++);
        mapaLivroFisico.put(livro.getId(), livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
            + "' relizada com sucesso", livro);
    }

    public static Collection<LivroFisico> obterLivrosFisicos(){
        return mapaLivroFisico.values();
    }

    public static void excluirLivro(Integer id){
        mapaLivroFisico.remove(id);
    }

    @GetMapping(value = "/livrofisico/{id}/excluir")
    public String excluirLivroFisico(@PathVariable Integer id){
        excluirLivro(id);
        System.out.println("Exclusão do Livro Físico " + id + " realizada com sucesso");
        return "redirect:/livrofisico/lista";
    }

    @GetMapping(value = "/livrofisico/lista")
    public String getLivroFisicoPage(Model model){
        model.addAttribute("listagemLivroFisico", obterLivrosFisicos());
        return "/livrofisico/lista";
    }
}
