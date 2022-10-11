package br.edu.infnet.emprestimolivro.model.domain;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;
import br.edu.infnet.emprestimolivro.model.exceptions.ListaLivrosVaziaException;
import br.edu.infnet.emprestimolivro.model.exceptions.SolicitanteNuloException;

@Entity
@Table(name = "TbEmprestimo")
public class Emprestimo implements IPrinter{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private boolean atraso;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idSolicitante")
    private Solicitante solicitante;

    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<Livro> livros;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

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
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
