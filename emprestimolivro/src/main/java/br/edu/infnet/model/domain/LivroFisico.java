package br.edu.infnet.model.domain;

public class LivroFisico extends Livro{

    private int numPaginas;
    private String conservacao;

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    // calcularDuracaoEmprestimo não implementado: mesmo comportamento da classe mãe

    @Override
    public String toString() {
        return super.toString() + "; " + this.numPaginas + "; " + this.conservacao;
    }

    @Override
    public void impressao() {
        System.out.println("# Livro Fisico");
        System.out.println(this); 
    }
    
}
