package br.edu.infnet.model.tests;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;


public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter printer){
        System.out.println(mensagem);
        printer.impressao();
    }
    
}
