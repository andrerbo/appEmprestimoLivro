package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.emprestimolivro.model.domain.Solicitante;
import br.edu.infnet.emprestimolivro.service.SolicitanteService;


@Controller
public class SolicitanteController {
    
    @Autowired
    private SolicitanteService solicitanteService;

    @GetMapping(value = "/solicitante/{id}/excluir")
    public String excluirLivroAudio(@PathVariable Integer id){
        solicitanteService.excluirSolicitante(id);
        System.out.println("Exclusão do Solicitante " + id + " realizada com sucesso");
        return "redirect:/solicitante/lista";
    }

    @GetMapping(value = "/solicitante/lista")
    public String getSolicitantePage(Model model){
        model.addAttribute("listagemSolicitante", solicitanteService.obterSolicitantes());
        return "/solicitante/lista";
    }

    @GetMapping(value = "/solicitante/cadastro")
    public String getSolicitanteCadastroPage(){
        return "/solicitante/cadastro";
    }

    @PostMapping(value = "/solicitante/incluir")
    public String postSolicitante(Solicitante solicitante){
        solicitanteService.incluirSolicitante(solicitante);
        return "redirect:/solicitante/lista";
    }
   
}
