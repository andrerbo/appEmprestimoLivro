package br.edu.infnet.emprestimolivro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LivroFisicoController {
    
    @GetMapping(value = "/classes/livrofisico")
    public String getLivroFisicoPage(){
        return "/classes/livrofisico";
    }
}
