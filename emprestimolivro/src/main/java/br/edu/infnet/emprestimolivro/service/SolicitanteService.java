package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.tests.AppImpressao;

@Service
public class SolicitanteService {
    
    // private static List<Solicitante> solicitantes = new ArrayList<Solicitante>();
    private static Map<Integer, Solicitante> mapaSolicitante = new HashMap<Integer, Solicitante>();
    private static Integer id = 1;
    
    public void incluirSolicitante(Solicitante solicitante){
        // solicitantes.add(solicitante);
        solicitante.setId(id++);
        mapaSolicitante.put(solicitante.getId(), solicitante);
        AppImpressao.relatorio("Inclusão de Solicitante relizada com sucesso", solicitante);
    }

    public Collection<Solicitante> obterSolicitantes(){
        return mapaSolicitante.values();
    }

    public void excluirSolicitante(Integer id){
        mapaSolicitante.remove(id);
    }
}
