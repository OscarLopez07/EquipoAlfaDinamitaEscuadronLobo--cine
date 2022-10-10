package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import com.cine.sprint3.model.Precios;

public interface PreciosServices {

	public List<Precios> getPrecios();
	public Optional<Precios> getPrecioByIdSala(Integer id);
	public Precios crearPrecios(Precios precios);
	public Precios actualizarPrecios(Precios precios);
	public void eliminarPrecios(Integer id);
	
}
