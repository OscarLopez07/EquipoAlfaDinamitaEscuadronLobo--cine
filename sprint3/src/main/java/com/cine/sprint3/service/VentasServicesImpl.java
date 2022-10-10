package com.cine.sprint3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.sprint3.model.Ventas;
import com.cine.sprint3.repository.VentasRepository;

@Service
public class VentasServicesImpl implements VentasServices {

	@Autowired
	private VentasRepository repositorio;
	
	@Override
	public List<Ventas> getVentas() {
		return repositorio.findAll();
	}

	@Override
	public Optional<Ventas> getVentasById(Integer id) {
		return repositorio.findById(id);
	}

	@Override
	public Ventas crearVenta(Ventas ventas) {
		return repositorio.save(ventas);
	}

	@Override
	public Ventas actualizarVentas(Ventas ventas) {
		return repositorio.save(ventas);
	}

	@Override
	public void eliminarVenta(Integer id) {
		repositorio.deleteById(id);

	}

}
