package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.emprestimolivro.model.domain.LivroFisico;
import br.edu.infnet.emprestimolivro.service.LivroFisicoService;


@Controller
public class LivroFisicoController {

    @Autowired
    private LivroFisicoService livroFisicoService;

    @GetMapping(value = "/livrofisico/{id}/excluir")
    public String excluirLivroFisico(@PathVariable Integer id){
        livroFisicoService.excluirLivro(id);
        System.out.println("Exclusão do Livro Físico " + id + " realizada com sucesso");
        return "redirect:/livrofisico/lista";
    }

    @GetMapping(value = "/livrofisico/lista")
    public String getLivroFisicoPage(Model model){
        model.addAttribute("listagemLivroFisico", livroFisicoService.obterLivrosFisicos());
        return "/livrofisico/lista";
    }

    @GetMapping(value = "/livrofisico/cadastro")
    public String getLivroFisicoCadastroPage(){
        return "/livrofisico/cadastro";
    }

    @PostMapping(value = "/livrofisico/incluir")
    public String postLivroFisico(LivroFisico livroFisico){
        livroFisicoService.incluirLivroFisico(livroFisico);
        return "redirect:/livrofisico/lista";
    }
   
    
}
