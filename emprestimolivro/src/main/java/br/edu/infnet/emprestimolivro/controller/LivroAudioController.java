package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.emprestimolivro.service.LivroAudioService;


@Controller
public class LivroAudioController {

    @Autowired
    private LivroAudioService livroAudioService;

    @GetMapping(value = "/livroaudio/{id}/excluir")
    public String excluirLivroAudio(@PathVariable Integer id){
        livroAudioService.excluirLivro(id);
        System.out.println("Exclusão do Livro Aúdio " + id + " realizada com sucesso");
        return "redirect:/livroaudio/lista";
    }

    @GetMapping(value = "/livroaudio/lista")
    public String getLivroAudioLivroPage(Model model){
        model.addAttribute("listagemAudioLivro", livroAudioService.obterLivrosAudio());
        return "/livroaudio/lista";
    }

}
