package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import com.cine.sprint3.model.Funciones;

public interface FuncionesServices {
	
	public List<Funciones> getFunciones();
	public Optional<Funciones> getFuncionesById(Integer id);
	public Funciones crearFunciones(Funciones funciones);
	public Funciones actualizarFunciones(Funciones funciones);
	public void eliminarFunciones(Integer id);
	
}
