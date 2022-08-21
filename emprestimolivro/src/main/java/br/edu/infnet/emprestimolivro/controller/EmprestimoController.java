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

import br.edu.infnet.model.domain.Emprestimo;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class EmprestimoController {

    // private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    private static Map<Integer, Emprestimo> mapaEmprestimo = new HashMap<Integer, Emprestimo>();
    private static Integer id = 1;

    public static void incluirEmprestimo(Emprestimo emprestimo){
        // emprestimos.add(emprestimo);
        emprestimo.setId(id++);
        mapaEmprestimo.put(emprestimo.getId(), emprestimo);
        AppImpressao.relatorio("Inclusão de empréstimo relizada com sucesso", emprestimo);
    }

    public static Collection<Emprestimo> obterEmprestimos(){
        return mapaEmprestimo.values();
    }

    public static void excluirEmprestimo(Integer id){
        mapaEmprestimo.remove(id);
    }

    @GetMapping(value = "/emprestimo/{id}/excluir")
    public String excluirLivroAudio(@PathVariable Integer id){
        excluirEmprestimo(id);
        System.out.println("Exclusão do Empréstimo " + id + " realizada com sucesso");
        return "redirect:/emprestimo/lista";
    }

    @GetMapping(value = "/emprestimo/lista")
    public String getEmprestimoPage(Model model){
        model.addAttribute("listagemEmprestimo", obterEmprestimos());
        return "/emprestimo/lista";
    }

}
