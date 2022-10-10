package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.repository.UsuarioRepository;
import br.edu.infnet.emprestimolivro.model.tests.AppImpressao;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;    
    private static Map<String, Usuario> mapaUsuarios = new HashMap<String, Usuario>();

    public Usuario validarUsuario(String email, String senha) {
        Usuario usuario = mapaUsuarios.get(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }
        return null;
    }

    public void incluirUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        mapaUsuarios.put(usuario.getEmail(), usuario);
        AppImpressao.relatorio("Inclusão do usuario '" + usuario.getNome()
                + "' relizada com sucesso", usuario);
    }

    public Collection<Usuario> obterUsuarios() {
        return mapaUsuarios.values();
    }

    public void excluirUsuario(String email){
        mapaUsuarios.remove(email);
    }

}
