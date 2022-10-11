package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.service.LivroService;


@Controller
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping(value = "/livro/{id}/excluir")
    public String excluirLivro(@PathVariable Integer id){
        livroService.excluirLivro(id);
        System.out.println("Exclusão do Livro " + id + " realizada com sucesso");
        return "redirect:/livro/lista";
    }

    @GetMapping(value = "/livro/lista")
    public String getLivroPage(Model model, @SessionAttribute("usuario") Usuario usuario){
        model.addAttribute("listagemLivro", livroService.obterLivros());
        return "/livro/lista";
    }

}
