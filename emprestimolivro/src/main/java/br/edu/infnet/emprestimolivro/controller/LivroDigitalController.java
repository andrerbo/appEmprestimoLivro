package br.edu.infnet.emprestimolivro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.LivroDigital;
import br.edu.infnet.model.tests.AppImpressao;

@Controller
public class LivroDigitalController {

    // private static List<LivroDigital> livros = new ArrayList<LivroDigital>();
    private static Map<Integer, LivroDigital> mapaLivroDigital = new HashMap<Integer, LivroDigital>();
    private static Integer id = 1;

    public static void incluirLivroDigital(LivroDigital livro) {
        // livros.add(livro);
        livro.setId(id++);
        mapaLivroDigital.put(livro.getId(), livro);
        AppImpressao.relatorio("Inclusão do livro '" + livro.getTitulo()
                + "' relizada com sucesso", livro);
    }

    public static Collection<LivroDigital> obterLivrosDigital() {
        return mapaLivroDigital.values();
    }

    public static void excluirLivro(Integer id) {
        mapaLivroDigital.remove(id);
    }

    @GetMapping(value = "/livrodigital/{id}/excluir")
    public String excluirLivroDigital(@PathVariable Integer id) {
        excluirLivro(id);
        System.out.println("Exclusão do Livro Digital " + id + " realizada com sucesso");
        return "redirect:/livrodigital/lista";
    }

    @GetMapping(value = "/livrodigital/lista")
    public String getLivroDigitalPage(Model model) {
        model.addAttribute("listagemLivroDigital", obterLivrosDigital());
        return "/livrodigital/lista";
    }
}
