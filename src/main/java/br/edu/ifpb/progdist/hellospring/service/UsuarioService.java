package br.edu.ifpb.progdist.hellospring.service;

import java.util.List;

import br.edu.ifpb.progdist.hellospring.dao.UsuariosDAO;
import br.edu.ifpb.progdist.hellospring.model.Usuario;

public class UsuarioService {
    private UsuariosDAO usuariosDAO = new UsuariosDAO();
    public List<Usuario> getUsuarios(){
        return usuariosDAO.getUsuarios();
    }

    public Usuario getUsuarioPorCodigo(int codigo){
        usuariosDAO.getUsuarios().stream().filter(Usuario u -> u.getCodigo() == codigo)
    }
}
