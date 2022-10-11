package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.emprestimolivro.model.domain.AudioBook;
import br.edu.infnet.emprestimolivro.model.domain.Usuario;
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
    public String getLivroAudioLivroPage(Model model, @SessionAttribute("usuario") Usuario usuario){
        model.addAttribute("listagemAudioLivro", livroAudioService.obterLivrosAudio(usuario));
        return "/livroaudio/lista";
    }

    @GetMapping(value = "/livroaudio/cadastro")
    public String getLivroAudioCadastroPage(){
        return "/livroaudio/cadastro";
    }

    @PostMapping(value = "/livroaudio/incluir")
    public String postLivroAudio(AudioBook livroAudio, @SessionAttribute("usuario") Usuario usuario){
        livroAudio.setUsuario(usuario);
        livroAudioService.incluirAudiobook(livroAudio);
        return "redirect:/livroaudio/lista";
    }

}
