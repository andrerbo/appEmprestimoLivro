package br.edu.infnet.emprestimolivro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Emprestimo;
import java.time.LocalDate;


@Component
@Order(4)
public class EmprestimoTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println();
        System.out.println("Classe: Emprestimo");
        System.out.println("Emprestimo 1:");
        Emprestimo e1 = new Emprestimo();
        e1.setDataInicio(LocalDate.now());
        e1.setDataDevolucao(LocalDate.now().plusDays(14));
        e1.setAtraso(false);
        System.out.println(e1);
        
        
        // System.out.println();
        System.out.println("Emprestimo 2");
        Emprestimo e2 = new Emprestimo();
        e2.setDataInicio(LocalDate.now().minusDays(20));
        e2.setDataDevolucao(LocalDate.now().minusDays(6));
        e2.setAtraso(true);
        System.out.println(e2);


        // System.out.println();
        System.out.println("Emprestimo 3");
        Emprestimo e3 = new Emprestimo();
        e3.setDataInicio(LocalDate.now().minusDays(7));
        e3.setDataDevolucao(LocalDate.now().plusDays(7));
        e3.setAtraso(false);
        System.out.println(e3);        
        System.out.println();
    }
    
}
