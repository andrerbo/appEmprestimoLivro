package br.edu.infnet.emprestimolivro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.model.domain.LivroDigital;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.exceptions.FormatoLivroDigitalInvalidoException;
import br.edu.infnet.emprestimolivro.service.LivroDigitalService;


@Component
@Order(4)
public class LivroDigitalTeste implements ApplicationRunner{

    @Autowired
    private LivroDigitalService livroDigitalService;

    @Override
    public void run(ApplicationArguments args) {

        Usuario usuario = new Usuario();
        usuario.setId(1);

        try {
            String dir = "C:\\arquivos\\";
            String file = "livro.txt";

            System.out.println("[INFO] -> Iniciando leitura de arquivo");
            FileReader fileReader = new FileReader(dir + file);
            BufferedReader leitura = new BufferedReader(fileReader);
            
            String linha = leitura.readLine();
            while(linha != null){ 
                String[] valores = linha.split(";");
                
                if("D".equalsIgnoreCase(valores[0])){
                    try { 
                        LivroDigital d1 = new LivroDigital();
                        d1.setUsuario(usuario);
                        d1.setCodigo(Integer.valueOf(valores[1]));
                        d1.setAutor(valores[2]);
                        d1.setTitulo(valores[3]);
                        d1.setCategoria(valores[4]);
                        d1.setFormato(valores[5]);
                        d1.setOffline(Boolean.valueOf(valores[5]));
                        System.out.println("Duração do empréstimo: " + d1.calcularDuracaoEmprestimo().toDays() + " dias"); 
                        livroDigitalService.incluirLivroDigital(d1);
                    } catch (FormatoLivroDigitalInvalidoException e){
                        System.out.println("[ERRO] -> " + e.getMessage());
                    }
                }
                linha = leitura.readLine();
            }

            leitura.close();
            fileReader.close();
        
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[ERRO] -> O arquivo não existe");
        
        } finally {
            System.out.println("[INFO] -> Processo finalizado");
        
        }

/*         try {
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
*/
    } 
}
