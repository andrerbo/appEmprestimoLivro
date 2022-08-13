package br.edu.infnet.emprestimolivro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmprestimoController {

    @GetMapping(value = "/classes/emprestimo")
    public String getEmprestimoPage(){
        return "/classes/emprestimo";
    }

}
