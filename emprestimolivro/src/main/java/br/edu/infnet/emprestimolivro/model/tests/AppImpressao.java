package br.edu.infnet.emprestimolivro.model.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;


public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter printer){
        System.out.println(mensagem);
        printer.impressao();
    }

    public static void main(String[] args) {
        String dir = "C:\\arquivos\\";
        String file = "emprestimo.txt";
    
        try {
            FileReader fileReader = new FileReader(dir + file);
            BufferedReader leitura = new BufferedReader(fileReader);

            String linha = leitura.readLine();
            while(linha != null){ 
                System.out.println(linha);
                linha = leitura.readLine();
            }

            leitura.close();
            fileReader.close();
        
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[ERRO] -> O arquivo não existe");
        
        } finally {
            System.out.println("[INFO] -> processo finalizado");
        }
    }
    
}
