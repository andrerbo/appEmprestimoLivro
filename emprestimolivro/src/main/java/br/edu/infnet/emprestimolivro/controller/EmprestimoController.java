package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.emprestimolivro.model.domain.Emprestimo;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.service.EmprestimoService;
import br.edu.infnet.emprestimolivro.service.LivroService;
import br.edu.infnet.emprestimolivro.service.SolicitanteService;


@Controller
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;
    @Autowired
    private SolicitanteService solicitanteService;
    @Autowired
    private LivroService livroService;

    @GetMapping(value = "/emprestimo/{id}/excluir")
    public String excluirEmprestimo(@PathVariable Integer id){
        emprestimoService.excluirEmprestimo(id);
        System.out.println("Exclusão do Empréstimo " + id + " realizada com sucesso");
        return "redirect:/emprestimo/lista";
    }

    @GetMapping(value = "/emprestimo/lista")
    public String getEmprestimoPage(Model model, @SessionAttribute("usuario") Usuario usuario){
        model.addAttribute("listagemEmprestimo", emprestimoService.obterEmprestimos(usuario));
        return "/emprestimo/lista";
    }

    @GetMapping(value = "/emprestimo/cadastro")
    public String getEmprestimoCadastroPage(Model model, @SessionAttribute("usuario") Usuario usuario){
        model.addAttribute("solicitantes", solicitanteService.obterSolicitantes(usuario));
        model.addAttribute("livros", livroService.obterLivros(usuario));
        return "/emprestimo/cadastro";
    }

    @PostMapping(value = "/emprestimo/incluir")
    public String postLivroAudio(Emprestimo emprestimo, @SessionAttribute("usuario") Usuario usuario){
        emprestimo.setUsuario(usuario);
        emprestimoService.incluirEmprestimo(emprestimo);
        return "redirect:/emprestimo/lista";
    }

}
