package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.Emprestimo;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.repository.EmprestimoRepository;
import br.edu.infnet.emprestimolivro.model.tests.AppImpressao;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public void incluirEmprestimo(Emprestimo emprestimo){
        emprestimoRepository.save(emprestimo);
        AppImpressao.relatorio("Inclusão de empréstimo relizada com sucesso", emprestimo);
    }

    public Collection<Emprestimo> obterEmprestimos(){
        return (Collection<Emprestimo>) emprestimoRepository.findAll();
    }

    public Collection<Emprestimo> obterEmprestimos(Usuario usuario){
        return (Collection<Emprestimo>) emprestimoRepository.findAll(usuario.getId());
    }

    public void excluirEmprestimo(Integer id){
        emprestimoRepository.deleteById(id);
    }
}
