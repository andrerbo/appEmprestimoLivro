package br.edu.infnet.emprestimolivro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.AudioBook;
import java.time.Duration;


@Component
@Order(3)
public class AudioBookTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println();
        System.out.println("Classe: AudioBook");
        System.out.println("AudioBook 1:");
        AudioBook a1 = new AudioBook();
        a1.setAutor("Arthur Conan Doyle");
        a1.setTitulo("Sherlock Holmes: O cão dos Baskerville");
        a1.setCategoria("Romance Policial");
        a1.setCodec(".mp3");
        a1.setDuracao(Duration.ofHours(6));
        System.out.println(a1);
        
        
        // System.out.println();
        System.out.println("AudioBook 2");
        AudioBook a2 = new AudioBook();
        a2.setAutor("Robert C. Martin");
        a2.setTitulo("Clean Code");
        a2.setCategoria("Tecnologia");
        a2.setCodec(".ogg");
        a2.setDuracao(Duration.ofHours(3));
        System.out.println(a2);


        // System.out.println();
        System.out.println("AudioBook 3");
        AudioBook a3 = new AudioBook();
        a3.setAutor("Paulo Yazig Sabbag");
        a3.setTitulo("Resiliência");
        a3.setCategoria("Auto-ajuda");
        a3.setCodec(".wav");
        a3.setDuracao(Duration.ofHours(8));
        System.out.println(a3);        
        System.out.println();               
        
    }
    
}
