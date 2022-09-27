package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.Emprestimo;
import br.edu.infnet.emprestimolivro.model.tests.AppImpressao;

@Service
public class EmprestimoService {

    // private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    private static Map<Integer, Emprestimo> mapaEmprestimo = new HashMap<Integer, Emprestimo>();
    private static Integer id = 1;

    public void incluirEmprestimo(Emprestimo emprestimo){
        // emprestimos.add(emprestimo);
        emprestimo.setId(id++);
        mapaEmprestimo.put(emprestimo.getId(), emprestimo);
        AppImpressao.relatorio("Inclusão de empréstimo relizada com sucesso", emprestimo);
    }

    public Collection<Emprestimo> obterEmprestimos(){
        return mapaEmprestimo.values();
    }

    public void excluirEmprestimo(Integer id){
        mapaEmprestimo.remove(id);
    }

}
