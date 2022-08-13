package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Livro;


public class AppLivro {

    private String mensagem;

    public AppLivro(String mensagem){
        this.mensagem = mensagem;
    }

    public  void relatorio(Livro livro){
        System.out.println(mensagem);
        livro.impressao();
    }
    
}
