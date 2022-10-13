package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.emprestimolivro.model.domain.LivroDigital;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.service.LivroDigitalService;

@Controller
public class LivroDigitalController {

    @Autowired
    private LivroDigitalService livroDigitalService;
    private String mensagem;
    private String mensagemTipo;

    @GetMapping(value = "/livrodigital/{id}/excluir")
    public String excluirLivroDigital(@PathVariable Integer id) {
        try{
            livroDigitalService.excluirLivro(id);
            mensagem = "Livro excluído com sucesso!";
            mensagemTipo = "alert-success";
            System.out.println("Exclusão do Livro aúdio " + id + " realizada com sucesso!");
        } catch(Exception e){
            mensagem = "Impossível excluir livro " + id + "!";
            mensagemTipo = "alert-danger";
        }

        return "redirect:/livrodigital/lista";
    }

    @GetMapping(value = "/livrodigital/lista")
    public String getLivroDigitalPage(Model model, @SessionAttribute("usuario") Usuario usuario) {
        model.addAttribute("listagemLivroDigital", livroDigitalService.obterLivrosDigital(usuario));
        model.addAttribute("mensagem", mensagem);
        model.addAttribute("mensagemTipo", mensagemTipo);
        return "/livrodigital/lista";
    }
    
    @GetMapping(value = "/livrodigital/cadastro")
    public String getLivroDigitalCadastroPage(){
        return "/livrodigital/cadastro";
    }

    @PostMapping(value = "/livrodigital/incluir")
    public String postLivroDigital(LivroDigital livroDigital, @SessionAttribute("usuario") Usuario usuario){
        livroDigital.setUsuario(usuario);
        livroDigitalService.incluirLivroDigital(livroDigital);
        mensagem = "Livro digital incluído com sucesso!";
        mensagemTipo = "alert-success";
        return "redirect:/livrodigital/lista";
    }
    
}
