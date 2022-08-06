package br.edu.infnet.model.domain;

public class Livro {

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

    @Override
    public String toString() {
        return this.autor + "; " + this.titulo + "; " + this.categoria;
    }
    
}
