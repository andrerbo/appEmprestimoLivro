package br.edu.infnet.emprestimolivro;

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.tests.AppImpressao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(5)
public class SolicitanteTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println();
        // System.out.println("Classe: Solicitante");
        // System.out.println("Solicitante 1:");
        Solicitante s1 = new Solicitante("Andre R.", "999.999.990-00", "andre@mail.com");
        // System.out.println(s1);
        AppImpressao.relatorio("Incluindo solicitante 1", s1);
        

        // System.out.println();
        // System.out.println("Solicitante 2");
        Solicitante s2 = new Solicitante("Roberto S.", "999.888.777-00", "roberto@mail.com");
        // System.out.println(s2);
        AppImpressao.relatorio("Incluindo solicitante 2", s2);


        // System.out.println();
        // System.out.println("Solicitante 3");
        Solicitante s3 = new Solicitante("Luisa A.", "000.000.123-00", "luisa@mail.com");
        // System.out.println(s3);
        AppImpressao.relatorio("Incluindo solicitante 3", s3);        
        System.out.println();
    }
}
