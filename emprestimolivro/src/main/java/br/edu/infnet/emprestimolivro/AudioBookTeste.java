package br.edu.infnet.emprestimolivro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.emprestimolivro.controller.LivroAudioController;
import br.edu.infnet.model.domain.AudioBook;
import br.edu.infnet.model.tests.AppImpressao;

import java.time.Duration;


@Component
@Order(3)
public class AudioBookTeste implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {

        AudioBook a1 = new AudioBook();
        a1.setCodigo(1);
        a1.setAutor("Arthur Conan Doyle");
        a1.setTitulo("Sherlock Holmes: O cão dos Baskerville");
        a1.setCategoria("Romance Policial");
        a1.setCodec(".mp3");
        a1.setDuracao(Duration.ofHours(6));
        LivroAudioController.inclruiAudiobook(a1);        
        
        AudioBook a2 = new AudioBook();
        a2.setCodigo(2);
        a2.setAutor("Robert C. Martin");
        a2.setTitulo("Clean Code");
        a2.setCategoria("Tecnologia");
        a2.setCodec(".ogg");
        a2.setDuracao(Duration.ofHours(3));
        LivroAudioController.inclruiAudiobook(a2);

        AudioBook a3 = new AudioBook();
        a3.setCodigo(3);
        a3.setAutor("Paulo Yazig Sabbag");
        a3.setTitulo("Resiliência");
        a3.setCategoria("Auto-ajuda");
        a3.setCodec(".wav");
        a3.setDuracao(Duration.ofHours(8));
        LivroAudioController.inclruiAudiobook(a3);
    }
    
}
