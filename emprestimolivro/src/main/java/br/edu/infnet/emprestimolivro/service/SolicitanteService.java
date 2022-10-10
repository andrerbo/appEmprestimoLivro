package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.Solicitante;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.repository.SolicitanteRepository;
import br.edu.infnet.emprestimolivro.model.tests.AppImpressao;

@Service
public class SolicitanteService {
    
    @Autowired
    private SolicitanteRepository solicitanteRepository;
    
    public void incluirSolicitante(Solicitante solicitante){
        solicitanteRepository.save(solicitante);
        AppImpressao.relatorio("Inclusão de Solicitante relizada com sucesso", solicitante);
    }

    public Collection<Solicitante> obterSolicitantes(){
        return (Collection<Solicitante>) solicitanteRepository.findAll();
    }

    public Collection<Solicitante> obterSolicitantes(Usuario usuario){
        return (Collection<Solicitante>) solicitanteRepository.obterSolicitantes(usuario.getId());
    }

    public void excluirSolicitante(Integer id){
        solicitanteRepository.deleteById(id);
    }
}
