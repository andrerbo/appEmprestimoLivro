package br.edu.infnet.emprestimolivro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.controller.LivroFisicoController;
import br.edu.infnet.model.domain.LivroFisico;
import br.edu.infnet.model.exceptions.EstadoLivroFisicoLamentavelException;


@Component
@Order(1)
public class LivroFisicoTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) {

        try {
            String dir = "C:\\arquivos\\";
            String file = "livrofisico.txt";

            System.out.println("[INFO] -> Iniciando leitura de arquivo");
            FileReader fileReader = new FileReader(dir + file);
            BufferedReader leitura = new BufferedReader(fileReader);
            
            String linha = leitura.readLine();
            while(linha != null){ 
                String[] valores = linha.split(";");
            
                try { 
                    LivroFisico f1 = new LivroFisico();
                    f1.setCodigo(Integer.valueOf(valores[0]));
                    f1.setAutor(valores[1]);
                    f1.setTitulo(valores[2]);
                    f1.setCategoria(valores[3]);
                    f1.setNumPaginas(Integer.valueOf(valores[4]));
                    f1.setConservacao(valores[5]);
                    System.out.println("Duração do empréstimo: " + f1.calcularDuracaoEmprestimo().toDays() + " dias"); 
                    LivroFisicoController.incluirLivroFisico(f1);
                } catch (EstadoLivroFisicoLamentavelException e){
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

/* 
        try {
            LivroFisico f1 = new LivroFisico();
            f1.setCodigo(7);
            f1.setAutor("Allen B. Downey");
            f1.setTitulo("Think Java");
            f1.setCategoria("Tecnologia");
            f1.setConservacao("Excelente");
            f1.setNumPaginas(354);
            LivroFisicoController.incluirLivroFisico(f1);
            System.out.println("Duração do empréstimo: " + f1.calcularDuracaoEmprestimo().toDays() + " dias");
        } catch (EstadoLivroFisicoLamentavelException e) {
            System.out.println("[ERRO] -> " + e.getMessage());
        }


        try {
            LivroFisico f2 = new LivroFisico();
            f2.setCodigo(8);
            f2.setAutor("Carlos E. Morimoto");
            f2.setTitulo("Hardware: O Guia Definitivo");
            f2.setCategoria("Tecnologia");
            f2.setConservacao("Novo");
            f2.setNumPaginas(207);
            LivroFisicoController.incluirLivroFisico(f2);
            System.out.println("Duração do empréstimo: " + f2.calcularDuracaoEmprestimo().toDays() + " dias");
        } catch (EstadoLivroFisicoLamentavelException e) {
            System.out.println("[ERRO] -> " + e.getMessage());
        }


        try {
            LivroFisico f3 = new LivroFisico();
            f3.setCodigo(9);
            f3.setAutor("Ray Bradbury");
            f3.setTitulo("Fahrenheit 451");
            f3.setCategoria("Ficção");
            f3.setConservacao("Lamentável");
            f3.setNumPaginas(654);
            LivroFisicoController.incluirLivroFisico(f3);
            System.out.println("Duração do empréstimo: " + f3.calcularDuracaoEmprestimo().toDays() + " dias");
        } catch (EstadoLivroFisicoLamentavelException e) {
            System.out.println("[ERRO] -> " + e.getMessage());
        } 
*/           
    }    
}
