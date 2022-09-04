package br.edu.infnet.model.domain;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;

public class Usuario implements IPrinter{
    
    private String nome;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void impressao() {
        System.out.println("############## Usuário");
        System.out.println(this);    
    }

    @Override
    public String toString(){
        return this.nome + "; " + this.email + "; " + this.senha;
    }

}
