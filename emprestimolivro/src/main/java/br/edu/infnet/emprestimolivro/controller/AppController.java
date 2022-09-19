package br.edu.infnet.emprestimolivro.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.emprestimolivro.service.UsuarioService;
import br.edu.infnet.model.domain.Usuario;

@SessionAttributes("usuario")
@Controller
public class AppController {

    @Autowired
    private UsuarioService usuarioService;

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
        
        Usuario usuario = usuarioService.validarUsuario(email, senha);
        if (usuario != null) {
            model.addAttribute("usuario", usuario);
            return "home";
        }
        return "redirect:/login";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status) {
        status.setComplete();
        session.removeAttribute("usuario");
        return "redirect:/";
    }
    
}
