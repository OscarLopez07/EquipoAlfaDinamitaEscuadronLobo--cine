package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.sprint3.model.Salas;
import com.cine.sprint3.repository.SalasRepository;

@Service
public class SalasServicesImpl implements SalasServices {

	@Autowired
	private SalasRepository repositorio;
	
	@Override
	public List<Salas> getSalas() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Salas> getSalaById(Integer id) {
		return repositorio.findById(id);
	}

	@Override
	public Salas crearSala(Salas salas) {
		return repositorio.save(salas);
	}

	@Override
	public Salas actualizarSala(Salas salas) {
		return repositorio.save(salas);
	}

	@Override
	public void eliminarSala(Integer id) {
		repositorio.deleteById(id);
		
	}

	

}
