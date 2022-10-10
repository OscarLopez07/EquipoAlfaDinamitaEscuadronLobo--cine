package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import com.cine.sprint3.model.Salas;

public interface SalasServices {
	
	public List<Salas> getSalas();
	public Optional<Salas> getSalaById(Integer id);
	public Salas crearSala(Salas salas);
	public Salas actualizarSala(Salas salas);
	public void eliminarSala(Integer id);

}
