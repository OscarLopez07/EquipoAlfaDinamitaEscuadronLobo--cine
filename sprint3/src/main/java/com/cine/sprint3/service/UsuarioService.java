package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import com.cine.sprint3.model.Usuario;


public interface UsuarioService {

	public List<Usuario> getUsuarios();
	public Optional<Usuario> getUsuarioById(Integer id);
	public Usuario crearUsuario(Usuario usuario);
	public Usuario actualizarUsuario(Usuario usuario);
	public void eliminarUsuario(Integer id);
	
}
