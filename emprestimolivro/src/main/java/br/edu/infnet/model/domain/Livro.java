package br.edu.infnet.model.domain;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;
import java.time.Duration;


public abstract class Livro implements IPrinter{

    private Integer id;
    private int codigo;
    private String autor;
    private String titulo;
    private String categoria;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public abstract Duration calcularDuracaoEmprestimo();

    @Override
    public String toString() {
        return calcularDuracaoEmprestimo().toDays() + " dia(s); " +  this.autor + "; " + this.titulo + "; " + this.categoria;
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
