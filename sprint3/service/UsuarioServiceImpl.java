package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.sprint3.model.Usuario;
import com.cine.sprint3.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;
	
	@Override
	public List<Usuario> getUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Usuario> getUsuarioById(Integer id) {
		return repositorio.findById(id);
	}

	@Override
	public Usuario crearUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public void eliminarUsuario(Integer id) {
		repositorio.deleteById(id);

	}

}
