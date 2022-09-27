package br.edu.infnet.emprestimolivro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.model.domain.AudioBook;
import br.edu.infnet.emprestimolivro.model.exceptions.DuracaoAudioBookMuitoCurtaException;
import br.edu.infnet.emprestimolivro.service.LivroAudioService;

@Component
@Order(3)
public class AudioBookTeste implements ApplicationRunner{

    @Autowired
    private LivroAudioService livroAudioService;

    @Override
    public void run(ApplicationArguments args) {

        try {
            String dir = "C:\\arquivos\\";
            String file = "livro.txt";

            System.out.println("[INFO] -> Iniciando leitura de arquivo");
            FileReader fileReader = new FileReader(dir + file);
            BufferedReader leitura = new BufferedReader(fileReader);
            
            String linha = leitura.readLine();
            while(linha != null){ 
                String[] valores = linha.split(";");

                if("A".equalsIgnoreCase(valores[0])){
                    try { 
                        AudioBook a1 = new AudioBook();
                        a1.setCodigo(Integer.valueOf(valores[1]));
                        a1.setAutor(valores[2]);
                        a1.setTitulo(valores[3]);
                        a1.setCategoria(valores[4]);
                        a1.setCodec(valores[5]);
                        a1.setDuracao(Integer.valueOf(valores[6]));
                        System.out.println("Duração do empréstimo: " + a1.calcularDuracaoEmprestimo().toDays() + " dias"); 
                        livroAudioService.incluirAudiobook(a1);
                    } catch (DuracaoAudioBookMuitoCurtaException e){
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

/*         
        try {
            AudioBook a1 = new AudioBook();
            a1.setCodigo(1);
            a1.setAutor("Arthur Conan Doyle");
            a1.setTitulo("Sherlock Holmes: O cão dos Baskerville");
            a1.setCategoria("Romance Policial");
            a1.setCodec(".mp3");
            a1.setDuracao(Duration.ofMinutes(6));
            LivroAudioController.incluirAudiobook(a1);
            System.out.println("Duração do empréstimo: " + a1.calcularDuracaoEmprestimo().toDays() + " dias");        
        } catch (DuracaoAudioBookMuitoCurtaException e){
            System.out.println("[ERRO] -> " + e.getMessage());
        }

        
        try{
            AudioBook a2 = new AudioBook();
            a2.setCodigo(2);
            a2.setAutor("Robert C. Martin");
            a2.setTitulo("Clean Code");
            a2.setCategoria("Tecnologia");
            a2.setCodec(".ogg");
            a2.setDuracao(Duration.ofHours(3));
            LivroAudioController.incluirAudiobook(a2);
            System.out.println("Duração do empréstimo: " + a2.calcularDuracaoEmprestimo().toDays() + " dias");
        } catch (DuracaoAudioBookMuitoCurtaException e){
            System.out.println("[ERRO] -> " + e.getMessage());
        }


        try{
            AudioBook a3 = new AudioBook();
            a3.setCodigo(3);
            a3.setAutor("Paulo Yazig Sabbag");
            a3.setTitulo("Resiliência");
            a3.setCategoria("Auto-ajuda");
            a3.setCodec(".wav");
            a3.setDuracao(Duration.ofHours(8));
            LivroAudioController.incluirAudiobook(a3);
            System.out.println("Duração do empréstimo: " + a3.calcularDuracaoEmprestimo().toDays() + " dias");
        } catch (DuracaoAudioBookMuitoCurtaException e) { 
            System.out.println("[ERRO] -> " + e.getMessage());
        } 
*/
    }
}
