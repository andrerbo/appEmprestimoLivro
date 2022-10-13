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
    private String mensagem;
    private String mensagemTipo;

    @GetMapping(value = "/livro/{id}/excluir")
    public String excluirLivro(@PathVariable Integer id){

        try{
            livroService.excluirLivro(id);
            mensagem = "Livro excluído com sucesso!";
            mensagemTipo = "alert-success";
            System.out.println("Exclusão do Livro " + id + " realizada com sucesso");
        } catch(Exception e){
            mensagem = "Impossível excluir livro " + id + "!";
            mensagemTipo = "alert-danger";
        }

        return "redirect:/livro/lista";
    }

    @GetMapping(value = "/livro/lista")
    public String getLivroPage(Model model, @SessionAttribute("usuario") Usuario usuario){
        model.addAttribute("listagemLivro", livroService.obterLivros());
        model.addAttribute("mensagem", mensagem);
        model.addAttribute("mensagemTipo", mensagemTipo);
        return "/livro/lista";
    }

}
