package br.edu.infnet.emprestimolivro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LivroDigitalController {
    
    @GetMapping(value = "/classes/livrodigital")
    public String getLivroDigitalPage(){
        return "/classes/livrodigital";
    }
}
