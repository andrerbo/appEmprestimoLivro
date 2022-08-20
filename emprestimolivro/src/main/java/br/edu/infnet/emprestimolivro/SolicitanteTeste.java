package br.edu.infnet.emprestimolivro;

import br.edu.infnet.emprestimolivro.controller.SolicitanteController;
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

        Solicitante s1 = new Solicitante("Andre R.", "999.999.990-00", "andre@mail.com");
        SolicitanteController.incluirSolicitante(s1);        

        Solicitante s2 = new Solicitante("Roberto S.", "999.888.777-00", "roberto@mail.com");
        SolicitanteController.incluirSolicitante(s2);        

        Solicitante s3 = new Solicitante("Luisa A.", "000.000.123-00", "luisa@mail.com");
        SolicitanteController.incluirSolicitante(s3);        
    }
}
