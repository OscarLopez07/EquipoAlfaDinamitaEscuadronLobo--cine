package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.sprint3.model.Funciones;
import com.cine.sprint3.repository.FuncionesRepository;

@Service
public class FuncionesServicesImpl implements FuncionesServices{

	@Autowired
	private FuncionesRepository repositorio;
	
	@Override
	public List<Funciones> getFunciones() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Funciones> getFuncionesById(Integer id) {
		return repositorio.findById(id);
	}

	@Override
	public Funciones crearFunciones(Funciones funciones) {
		return repositorio.save(funciones);
	}

	@Override
	public Funciones actualizarFunciones(Funciones funciones) {
		return repositorio.save(funciones);
	}

	@Override
	public void eliminarFunciones(Integer id) {
		repositorio.deleteById(id);
	}

}
