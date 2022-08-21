package br.edu.infnet.model.domain;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;

public class Solicitante implements IPrinter{

    private Integer id;
    private String nome;
    private String cpf;
    private String email;

    public Solicitante(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nome + "; " + this.cpf + "; " + this.email;
    }

    @Override
    public void impressao() {
        System.out.println("############## Solicitante");
        System.out.println(this);        
    }

}
