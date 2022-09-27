package br.edu.infnet.emprestimolivro.model.domain;

import java.time.Duration;

import br.edu.infnet.emprestimolivro.model.exceptions.EstadoLivroFisicoLamentavelException;

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


    @Override
    public Duration calcularDuracaoEmprestimo() throws EstadoLivroFisicoLamentavelException{

        if (this.conservacao == "Lamentável"){ 
            throw new EstadoLivroFisicoLamentavelException("Livro em péssimo estado, não pode ser emprestado. Tenha mais cuidado da próxima vez!");
        }

        return Duration.ofDays(30);
    }

    @Override
    public String toString() {
        return super.toString() + "; " + this.numPaginas + "; " + this.conservacao;
    }

    @Override
    public void impressao() {
        System.out.println("############## Livro Fisico");
        System.out.println(this); 
    }
    
}
