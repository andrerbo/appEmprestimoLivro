package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.emprestimolivro.service.EmprestimoService;


@Controller
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping(value = "/emprestimo/{id}/excluir")
    public String excluirLivroAudio(@PathVariable Integer id){
        emprestimoService.excluirEmprestimo(id);
        System.out.println("Exclusão do Empréstimo " + id + " realizada com sucesso");
        return "redirect:/emprestimo/lista";
    }

    @GetMapping(value = "/emprestimo/lista")
    public String getEmprestimoPage(Model model){
        model.addAttribute("listagemEmprestimo", emprestimoService.obterEmprestimos());
        return "/emprestimo/lista";
    }

}
