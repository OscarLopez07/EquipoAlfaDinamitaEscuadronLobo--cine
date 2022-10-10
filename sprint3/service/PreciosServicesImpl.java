package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.sprint3.model.Precios;
import com.cine.sprint3.repository.PreciosRepository;

@Service
public class PreciosServicesImpl implements PreciosServices{

	@Autowired
	private PreciosRepository repositorio;
	
	@Override
	public List<Precios> getPrecios() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Precios> getPrecioByIdSala(Integer id) {
		return repositorio.findById(id);
	}

	@Override
	public Precios crearPrecios(Precios precios) {
		return repositorio.save(precios);
	}

	@Override
	public Precios actualizarPrecios(Precios precios) {
		return repositorio.save(precios);
	}

	@Override
	public void eliminarPrecios(Integer id) {
		repositorio.deleteById(id);
	}
	

}
