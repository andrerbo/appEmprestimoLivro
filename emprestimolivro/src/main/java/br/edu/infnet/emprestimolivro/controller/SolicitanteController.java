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

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.tests.AppImpressao;


@Controller
public class SolicitanteController {
    
    // private static List<Solicitante> solicitantes = new ArrayList<Solicitante>();
    private static Map<Integer, Solicitante> mapaSolicitante = new HashMap<Integer, Solicitante>();
    private static Integer id = 1;

    
    public static void incluirSolicitante(Solicitante solicitante){
        // solicitantes.add(solicitante);
        solicitante.setId(id++);
        mapaSolicitante.put(solicitante.getId(), solicitante);
        AppImpressao.relatorio("Inclusão de Solicitante relizada com sucesso", solicitante);
    }

    public static Collection<Solicitante> obterSolicitantes(){
        return mapaSolicitante.values();
    }

    public static void excluirSolicitante(Integer id){
        mapaSolicitante.remove(id);
    }

    @GetMapping(value = "/solicitante/{id}/excluir")
    public String excluirLivroAudio(@PathVariable Integer id){
        excluirSolicitante(id);
        System.out.println("Exclusão do Solicitante " + id + " realizada com sucesso");
        return "redirect:/solicitante/lista";
    }

    @GetMapping(value = "/solicitante/lista")
    public String getSolicitantePage(Model model){
        model.addAttribute("listagemSolicitante", obterSolicitantes());
        return "/solicitante/lista";
    }
   
}
