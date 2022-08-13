package br.edu.infnet.emprestimolivro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LivroAudioController {

    @GetMapping(value = "/classes/livroaudio")
    public String getLivroAudioLivroPage(){
        return "/classes/livroaudio";
    }    
}
