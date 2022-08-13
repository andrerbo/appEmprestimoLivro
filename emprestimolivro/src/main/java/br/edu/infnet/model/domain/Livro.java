package br.edu.infnet.model.domain;

import br.edu.infnet.emprestimolivro.interfaces.IPrinter;
import java.time.Duration;


public abstract class Livro implements IPrinter{

    private String autor;
    private String titulo;
    private String categoria;

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
    
}
