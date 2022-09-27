package br.edu.infnet.emprestimolivro.model.domain;

// import java.util.List;
import java.time.LocalDate;
import java.util.Set;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;
import br.edu.infnet.emprestimolivro.model.exceptions.ListaLivrosVaziaException;
import br.edu.infnet.emprestimolivro.model.exceptions.SolicitanteNuloException;


public class Emprestimo implements IPrinter{

    private Integer id;
    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private boolean atraso;
    private Solicitante solicitante;
    private Set<Livro> livros;


    public Emprestimo(Solicitante solicitante, Set<Livro> livros) throws SolicitanteNuloException, ListaLivrosVaziaException{
        if (solicitante == null){
            throw new SolicitanteNuloException("Impossível criar empréstimo sem solicitante");
        }
    
        if (livros == null){
            throw new ListaLivrosVaziaException("Impossível criar empréstimo sem livro");
        }
        
        this.dataInicio = LocalDate.now();
        this.solicitante = solicitante;
        this.livros = livros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }
    
    // public void setDataInicio(LocalDate dataInicio) {
    //     this.dataInicio = dataInicio;
    // }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isAtraso() {
        return atraso;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

    public Set<Livro> getLivros() {
        return livros;
    }

    // public void setLivros(Set<Livro> livros) {
    //     this.livros = livros;
    // }
    
    @Override
    public String toString() {
        return this.dataInicio + "; " + this.dataDevolucao + "; " + this.atraso + "; " + this.solicitante + "; " + this.livros.size();
    }

    @Override
    public void impressao() {
        System.out.println("############## Empréstimo");
        System.out.println(this);        
    }

    
}
