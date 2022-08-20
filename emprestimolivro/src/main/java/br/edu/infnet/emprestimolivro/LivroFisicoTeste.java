package br.edu.infnet.emprestimolivro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.controller.LivroFisicoController;
import br.edu.infnet.model.domain.LivroFisico;
import br.edu.infnet.model.tests.AppImpressao;


@Component
@Order(1)
public class LivroFisicoTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // System.out.println("Classe: LivroFisico");
        // System.out.println("LivroFisico 1:");
        LivroFisico f1 = new LivroFisico();
        f1.setCodigo(7);
        f1.setAutor("Allen B. Downey");
        f1.setTitulo("Think Java");
        f1.setCategoria("Tecnologia");
        f1.setConservacao("Excelente");
        f1.setNumPaginas(354);
        LivroFisicoController.incluirLivroFisico(f1);
        // AppImpressao.relatorio("Inclusão do livro 'Think Java'", f1);
        

        // System.out.println();
        // System.out.println("LivroFisico 2");
        LivroFisico f2 = new LivroFisico();
        f2.setCodigo(8);
        f2.setAutor("Carlos E. Morimoto");
        f2.setTitulo("Hardware: O Guia Definitivo");
        f2.setCategoria("Tecnologia");
        f2.setConservacao("Novo");
        f2.setNumPaginas(207);
        LivroFisicoController.incluirLivroFisico(f2);
        // AppImpressao.relatorio("Inclusão do livro 'Hardware: O Guia Definitivo'", f2);


        // System.out.println();
        // System.out.println("LivroFisico 3");
        LivroFisico f3 = new LivroFisico();
        f3.setCodigo(9);
        f3.setAutor("Ray Bradbury");
        f3.setTitulo("Fahrenheit 451");
        f3.setCategoria("Ficção");
        f3.setConservacao("Bom estado");
        f3.setNumPaginas(654);
        LivroFisicoController.incluirLivroFisico(f3);
        // AppImpressao.relatorio("Inclusão do livro 'Fahrenheit 451'", f3);               
    }    
}
