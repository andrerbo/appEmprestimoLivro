package br.edu.infnet.emprestimolivro.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.emprestimolivro.model.domain.Usuario;
import br.edu.infnet.emprestimolivro.model.exceptions.UsuarioAdminNaoPodeSerDeletadoException;
import br.edu.infnet.emprestimolivro.model.repository.UsuarioRepository;
import br.edu.infnet.emprestimolivro.model.tests.AppImpressao;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;  

    public Usuario validarUsuario(String email, String senha) {
        Collection<Usuario> userList = this.obterUsuarios();
        
        for(Usuario user: userList){
            if(user.getEmail().equals(email) && user.getSenha().equals(senha)){
                return user;
            }
        }
        
        return null;
    }


    public void incluirUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        AppImpressao.relatorio("Inclusão do usuario '" + usuario.getNome()
                + "' relizada com sucesso", usuario);
    }
    

    public Collection<Usuario> obterUsuarios() {
        return (Collection<Usuario>) usuarioRepository.findAll();
    }


    public void excluirUsuario(Integer id) throws UsuarioAdminNaoPodeSerDeletadoException{
        Usuario usuario = usuarioRepository.findById(id).get();
        if (usuario.isAdmin() == true){
            throw new UsuarioAdminNaoPodeSerDeletadoException("Admin não pode ser deletado!");
        }
        usuarioRepository.deleteById(id);
    }

}
