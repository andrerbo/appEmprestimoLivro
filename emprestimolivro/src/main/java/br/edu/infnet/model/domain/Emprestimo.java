package br.edu.infnet.model.domain;
// java libraries
import java.time.LocalDate;
// import java.util.List;
import java.util.Set;
// interfaces
import br.edu.infnet.emprestimolivro.interfaces.IPrinter;


public class Emprestimo implements IPrinter{

    private Integer id;
    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private boolean atraso;
    private Solicitante solicitante;
    private Set<Livro> livros;


    public Emprestimo(Solicitante solicitante) {
        this.dataInicio = LocalDate.now();
        this.solicitante = solicitante;
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

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }
    
    @Override
    public String toString() {
        return this.dataInicio + "; " + this.dataDevolucao + "; " + this.atraso + "; " + this.solicitante + "; " + this.livros.size();
    }

    @Override
    public void impressao() {
        System.out.println("# Empréstimo");
        System.out.println(this);        
    }

    
}
