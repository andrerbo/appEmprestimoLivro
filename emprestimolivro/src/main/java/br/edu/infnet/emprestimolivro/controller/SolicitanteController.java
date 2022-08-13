package br.edu.infnet.emprestimolivro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SolicitanteController {
    
    @GetMapping(value = "/classes/solicitante")
    public String getSolicitantePage(){
        return "/classes/solicitante";
    }

    
}
