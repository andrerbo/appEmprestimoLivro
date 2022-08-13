package br.edu.infnet.model.domain;

import java.time.Duration;

public class LivroDigital extends Livro{
    
    private String formato;
    private boolean offline;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    @Override
    public Duration calcularDuracaoEmprestimo() {

        // comportamento completamente diferente da classe mãe
        return this.offline ? Duration.ofDays(2) : Duration.ofDays(60);

    }

    @Override
    public String toString() {
        return super.toString() + "; " + this.formato + "; " + this.offline;
    }

    @Override
    public void impressao() {
        System.out.println("# Livro Digital");
        System.out.println(this);
    }
    
}
