package br.edu.infnet.emprestimolivro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.model.domain.Usuario;

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping(value = "/login")
    public String getLoginPage() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String postLogin(Model model, @RequestParam String email, @RequestParam String senha) {
        
        Usuario usuario = UsuarioController.validarUsuario(email, senha);
        if (usuario != null) {
            model.addAttribute("nomeUsuario", usuario.getNome());
            return "home";
        }
        return "redirect:/login";
    }

    @GetMapping(value = "/logout")
    public String logout(Model model) {

        model.addAttribute("nomeUsuario", "");
        return "redirect:/";
    }
}
