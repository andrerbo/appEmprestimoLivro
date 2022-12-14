package br.edu.infnet.emprestimolivro.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;

@Entity
@Table(name = "TbUsuario")
public class Usuario implements IPrinter{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean admin;
    private String nome;
    private String email;
    private String senha;

    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Solicitante> solicitantes;

    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Livro> livros;

    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Emprestimo> emprestimos;

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Solicitante> getSolicitantes() {
        return solicitantes;
    }

    public void setSolicitantes(List<Solicitante> solicitantes) {
        this.solicitantes = solicitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public void impressao() {
        System.out.println("############## Usu??rio");
        System.out.println(this);    
    }

    @Override
    public String toString(){
        return this.nome + "; " + this.email + "; " + this.senha + "; " + this.isAdmin();
    }

}
