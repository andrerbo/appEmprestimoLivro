package br.edu.infnet.emprestimolivro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.controller.LivroDigitalController;
import br.edu.infnet.model.domain.LivroDigital;
import br.edu.infnet.model.exceptions.FormatoLivroDigitalInvalidoException;


@Component
@Order(2)
public class LivroDigitalTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) {

        try {
        LivroDigital d1 = new LivroDigital();
        d1.setCodigo(4);
        d1.setAutor("Robert C. Martin");
        d1.setTitulo("Clean Architecture");
        d1.setCategoria("Tecnologia");
        d1.setFormato(".pdf");
        d1.setOffline(true);
        LivroDigitalController.incluirLivroDigital(d1);
        System.out.println("Duração do empréstimo: " + d1.calcularDuracaoEmprestimo().toDays() + " dias");
        } catch (FormatoLivroDigitalInvalidoException e) {
            System.out.println("[ERRO] -> " + e.getMessage());
        }
        
        try {
        LivroDigital d2 = new LivroDigital();
        d2.setCodigo(5);
        d2.setAutor("Lucia M. Almeida");
        d2.setTitulo("O Escaravelho do Diabo");
        d2.setCategoria("Romance Policial");
        d2.setFormato(".epub");
        d2.setOffline(true);
        LivroDigitalController.incluirLivroDigital(d2);
        System.out.println("Duração do empréstimo: " + d2.calcularDuracaoEmprestimo().toDays() + " dias");
        } catch (FormatoLivroDigitalInvalidoException e){
            System.out.println("[ERRO] -> " + e.getMessage());
        }


        try {
        LivroDigital d3 = new LivroDigital();
        d3.setCodigo(6);
        d3.setAutor("Jonh Doerr");
        d3.setTitulo("Avalie o Que Importa");
        d3.setCategoria("Auto-ajuda");
        d3.setFormato(".pdf");
        d3.setOffline(false);
        LivroDigitalController.incluirLivroDigital(d3);  
        System.out.println("Duração do empréstimo: " + d3.calcularDuracaoEmprestimo().toDays() + " dias");      
        } catch (FormatoLivroDigitalInvalidoException e ){ 
            System.out.println("[ERRO] -> " + e.getMessage());
        }
    }
}
