package br.edu.infnet.emprestimolivro.model.domain;

import java.time.Duration;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;
import br.edu.infnet.emprestimolivro.model.exceptions.DuracaoAudioBookMuitoCurtaException;
import br.edu.infnet.emprestimolivro.model.exceptions.EstadoLivroFisicoLamentavelException;
import br.edu.infnet.emprestimolivro.model.exceptions.FormatoLivroDigitalInvalidoException;

@Entity
@Table(name = "TbLivro")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Livro implements IPrinter{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int codigo;
    private String autor;
    private String titulo;
    private String categoria;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToMany(mappedBy = "livros")
    private List<Emprestimo> emprestimos;

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract Duration calcularDuracaoEmprestimo() throws FormatoLivroDigitalInvalidoException, DuracaoAudioBookMuitoCurtaException, EstadoLivroFisicoLamentavelException;

    @Override
    public String toString() {
        return /*calcularDuracaoEmprestimo().toDays() + " dia(s); " + */ this.autor + "; " + this.titulo + "; " + this.categoria;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        // if (getClass() != obj.getClass())
        //     return false;
        Livro other = (Livro) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }    
    
}
