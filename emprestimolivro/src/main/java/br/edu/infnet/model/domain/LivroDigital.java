package br.edu.infnet.model.domain;

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
    public String toString() {
        return super.toString() + "; " + this.formato + "; " + this.offline;
    }
    
}
