package br.edu.infnet.model.domain;

public class Solicitante {

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
    
}
