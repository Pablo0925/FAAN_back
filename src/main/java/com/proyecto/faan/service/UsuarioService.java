package com.proyecto.faan.service;

import com.proyecto.faan.model.Usuario;
import com.proyecto.faan.service.generic.GenericService;

public interface UsuarioService extends GenericService<Usuario, Integer> {
    public Usuario findByUsernameAndPassword(String username, String password);

    public Usuario findByPersonaEmail(String identificacion);

    public Usuario findByTokenPassword(String tokenPassword);
    
    /*public void cambiarEstado (Usuario usuario) throws Exception{
    	String sql = "UPDATE usuario set estado_usuario = "
    			+ (usuario.getEstadoUsuario()== true ? "1" : "0")
    			+ "WHERE id_usuario = " + usuario.getIdUsuario();
    	try {
			this.conectar(false)
		} catch (Exception e) {
			// TODO: handle exception
		}
    }*/
}
