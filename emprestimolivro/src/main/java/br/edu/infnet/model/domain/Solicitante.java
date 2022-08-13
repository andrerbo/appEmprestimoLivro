package br.edu.infnet.model.domain;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;

public class Solicitante implements IPrinter{

    public String nome;
    public String cpf;
    public String email;

    public Solicitante(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nome + "; " + this.cpf + "; " + this.email;
    }

    @Override
    public void impressao() {
        System.out.println("# Solicitante");
        System.out.println(this);        
    }
    
}
