package br.edu.infnet.emprestimolivro;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.model.domain.Emprestimo;
import br.edu.infnet.emprestimolivro.model.domain.Livro;
import br.edu.infnet.emprestimolivro.model.domain.LivroFisico;
import br.edu.infnet.emprestimolivro.model.domain.Solicitante;
import br.edu.infnet.emprestimolivro.model.exceptions.ListaLivrosVaziaException;
import br.edu.infnet.emprestimolivro.model.exceptions.SolicitanteNuloException;
import br.edu.infnet.emprestimolivro.service.EmprestimoService;


@Component
@Order(6)
public class EmprestimoTeste implements ApplicationRunner{

    @Autowired
    private EmprestimoService emprestimoService;

    @Override
    public void run(ApplicationArguments args) {

        try{
            Set<Livro> livros = new HashSet<Livro>();
            
            LivroFisico l1 = new LivroFisico();
            l1.setId(1);
            LivroFisico l2 = new LivroFisico();
            l2.setId(2);
            LivroFisico l3 = new LivroFisico();
            l3.setId(3);
            
            livros.add(l1);
            livros.add(l2);
            livros.add(l3);

            Solicitante solicitante = new Solicitante();
            solicitante.setId(1);

            Emprestimo emprestimo = new Emprestimo(solicitante, livros);
            emprestimo.setDataDevolucao(LocalDate.parse("2022-09-11"));
            emprestimo.setAtraso(true);
            emprestimoService.incluirEmprestimo(emprestimo);

        } catch (SolicitanteNuloException e){
            System.out.println("[ERRO] -> " + e.getMessage());
        } catch (ListaLivrosVaziaException e){
            System.out.println("[ERRO] -> " + e.getMessage());
        }
    }
}
