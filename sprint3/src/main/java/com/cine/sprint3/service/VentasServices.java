package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import com.cine.sprint3.model.Ventas;

public interface VentasServices {
	
	public List<Ventas> getVentas();
	public Optional<Ventas> getVentasById(Integer id);
	public Ventas crearVenta(Ventas ventas);
	public Ventas actualizarVentas(Ventas ventas);
	public void eliminarVenta(Integer id);

}
