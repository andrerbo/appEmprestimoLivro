package br.edu.infnet.emprestimolivro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class SolicitanteController {
    
    private static List<Solicitante> solicitantes = new ArrayList<Solicitante>();

    
    public static void incluirSolicitante(Solicitante solicitante){
        solicitantes.add(solicitante);
        AppImpressao.relatorio("Inclusão de solicitante relizada com sucesso", solicitante);
    }

    @GetMapping(value = "/classes/solicitante")
    public String getSolicitantePage(Model model){
        model.addAttribute("listagemSolicitante", solicitantes);
        return "/solicitante/solicitante";
    }
   
}
