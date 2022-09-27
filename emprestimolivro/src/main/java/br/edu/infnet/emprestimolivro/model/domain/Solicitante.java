package br.edu.infnet.emprestimolivro.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;
import br.edu.infnet.emprestimolivro.model.exceptions.CpfInvalidoException;
import br.edu.infnet.emprestimolivro.model.exceptions.CpfNuloException;

@Entity
@Table(name = "TbSolicitante")
public class Solicitante implements IPrinter{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String email;

    public Solicitante(){

    }

    public Solicitante(String nome, String cpf, String email) throws CpfInvalidoException, CpfNuloException{

        if (cpf == null){
            throw new CpfNuloException("Solicitante não pode ser adicionado: CPF nulo");
        }

        if (cpf.isEmpty()){
            throw new CpfInvalidoException("Solicitante não pode ser adicionado: CPF vazio");
        }

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
