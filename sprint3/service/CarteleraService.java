package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import com.cine.sprint3.model.Cartelera;

public interface CarteleraService {

	public List<Cartelera> getCartelera();
	public Optional<Cartelera> getCarteleraById(Integer id);
	public Cartelera crearCartelera(Cartelera cartelera);
	public Cartelera actualizarCartelera(Cartelera cartelera);
	public void eliminarCartelera(Integer id);
	
}
