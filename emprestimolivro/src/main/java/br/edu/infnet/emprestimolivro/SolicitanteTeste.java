package br.edu.infnet.emprestimolivro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.model.domain.Solicitante;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.exceptions.CpfInvalidoException;
import br.edu.infnet.emprestimolivro.model.exceptions.CpfNuloException;
import br.edu.infnet.emprestimolivro.service.SolicitanteService;


@Component
@Order(2)
public class SolicitanteTeste implements ApplicationRunner{

    @Autowired
    private SolicitanteService solicitanteService;

    @Override
    public void run(ApplicationArguments args) /*throws Exception*/ {
        
        Usuario usuario = new Usuario();
        usuario.setId(1);

        try {
            String dir = "C:\\arquivos\\";
            String file = "solicitante.txt";

            System.out.println("[INFO] -> Iniciando leitura de arquivo");
            FileReader fileReader = new FileReader(dir + file);
            BufferedReader leitura = new BufferedReader(fileReader);
            
            String linha = leitura.readLine();
            while(linha != null){ 
                String[] valores = linha.split(";");
            
                try { 
                    Solicitante solicitante = new Solicitante(valores[0], valores[1], valores[2]);
                    solicitante.setUsuario(usuario);
                    solicitanteService.incluirSolicitante(solicitante);
                    
                } catch (CpfInvalidoException | CpfNuloException e){
                    System.out.println("[ERRO] -> " + e.getMessage());
                }

                linha = leitura.readLine();
            }

            leitura.close();
            fileReader.close();
        
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[ERRO] -> O arquivo não existe");
        
        } finally {
            System.out.println("[INFO] -> Processo finalizado");
        }


        /* try {
            Solicitante s1 = new Solicitante("Andre R.", "999.999.990-00", "andre@mail.com");
            SolicitanteController.incluirSolicitante(s1);
        } catch (Exception e) {
            System.out.println("[ERRO] ->  " + e.getMessage());
        }
                
        
        try {
            Solicitante s2 = new Solicitante("Roberto S.", "999.888.777-00", "roberto@mail.com");        
            SolicitanteController.incluirSolicitante(s2);        
        } catch (Exception e) {
            System.out.println("[ERRO] ->  " + e.getMessage());
        }

        
        try {
            Solicitante s3 = new Solicitante("Luisa A.", "000.000.123-00", "luisa@mail.com");
            SolicitanteController.incluirSolicitante(s3);
        } catch (Exception e) {
            System.out.println("[ERRO] ->  " + e.getMessage());
        }

        
        try {
            Solicitante s4 = new Solicitante("Ronaldo G.", null, "ronaldo@mail.com");
            SolicitanteController.incluirSolicitante(s4);
        } catch (Exception e) {
            System.out.println("[ERRO] ->  " + e.getMessage());
        }


        try {
            Solicitante s5 = new Solicitante("Xavier H.", "", "xavier@mail.com");
            SolicitanteController.incluirSolicitante(s5);
        } catch (Exception e) {
            System.out.println("[ERRO] ->  " + e.getMessage());
        } */       

    }

}
