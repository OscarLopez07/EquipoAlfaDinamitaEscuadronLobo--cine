package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.sprint3.model.Cartelera;
import com.cine.sprint3.repository.CarteleraRepository;

@Service
public class CarteleraServiceImpl implements CarteleraService {

	@Autowired
	private CarteleraRepository repositorio;
	
	@Override
	public List<Cartelera> getCartelera() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Cartelera> getCarteleraById(Integer id) {
		return repositorio.findById(id);
	}

	@Override
	public Cartelera crearCartelera(Cartelera cartelera) {
		return repositorio.save(cartelera);
	}

	@Override
	public Cartelera actualizarCartelera(Cartelera cartelera) {
		return repositorio.save(cartelera);
	}

	@Override
	public void eliminarCartelera(Integer id) {
		repositorio.deleteById(id);
	}

}
