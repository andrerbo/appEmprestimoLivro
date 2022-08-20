package br.edu.infnet.emprestimolivro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.model.domain.Emprestimo;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class EmprestimoController {

    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();


    public static void incluirEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        AppImpressao.relatorio("Inclusão de empréstimo relizada com sucesso", emprestimo);
    }

    @GetMapping(value = "/classes/emprestimo")
    public String getEmprestimoPage(Model model){
        model.addAttribute("listagemEmprestimo", emprestimos);
        return "/emprestimo/emprestimo";
    }

}
