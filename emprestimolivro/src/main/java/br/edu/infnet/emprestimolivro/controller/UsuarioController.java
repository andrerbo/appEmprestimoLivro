package br.edu.infnet.emprestimolivro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.emprestimolivro.service.UsuarioService;
import br.edu.infnet.model.domain.Usuario;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario/lista")
    public String getUsuarioPage(Model model) {
        model.addAttribute("listagemUsuario", usuarioService.obterUsuarios());
        return "/usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String getCadastroPage() {
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String postUsuario(Usuario usuario){
        usuarioService.incluirUsuario(usuario);
        return "redirect:/";
    }

    @GetMapping(value = "/usuario/{email}/excluir")
    public String excluirUsuario(@PathVariable String email){
        usuarioService.excluirUsuario(email);
        System.out.println("Exclusão do Usuário " + email + " realizada com sucesso");
        return "redirect:/usuario/lista";
    }
    
}
