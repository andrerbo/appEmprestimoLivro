package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.emprestimolivro.service.LivroDigitalService;

@Controller
public class LivroDigitalController {

    @Autowired
    private LivroDigitalService livroDigitalService;

    @GetMapping(value = "/livrodigital/{id}/excluir")
    public String excluirLivroDigital(@PathVariable Integer id) {
        livroDigitalService.excluirLivro(id);
        System.out.println("Exclusão do Livro Digital " + id + " realizada com sucesso");
        return "redirect:/livrodigital/lista";
    }

    @GetMapping(value = "/livrodigital/lista")
    public String getLivroDigitalPage(Model model) {
        model.addAttribute("listagemLivroDigital", livroDigitalService.obterLivrosDigital());
        return "/livrodigital/lista";
    }
    
}
