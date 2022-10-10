package br.edu.infnet.emprestimolivro.model.domain;

import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.emprestimolivro.model.exceptions.FormatoLivroDigitalInvalidoException;

@Entity
@Table(name = "TbLivrodigital")
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
    public Duration calcularDuracaoEmprestimo() throws FormatoLivroDigitalInvalidoException {

        if (this.formato == ".epub"){
            throw new FormatoLivroDigitalInvalidoException(
                this.getTitulo() + ": Formato indisponível para empréstimo");
        }
        // comportamento diferente da classe mãe
        return this.offline ? Duration.ofDays(2) : Duration.ofDays(60);

    }

    @Override
    public String toString() {
        return super.toString() + "; " + this.formato + "; " + this.offline;
    }

    @Override
    public void impressao() {
        System.out.println("############## Livro Digital");
        System.out.println(this);
    }
    
}
