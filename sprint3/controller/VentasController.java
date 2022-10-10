package com.cine.sprint3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cine.sprint3.model.Ventas;
import com.cine.sprint3.service.VentasServices;

@RestController
@RequestMapping("/api/ventas")
public class VentasController {

	@Autowired
	private VentasServices servicio;
	
	@GetMapping
	public ResponseEntity<?> getVentas(){
		return ResponseEntity.ok(servicio.getVentas());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getVenta(@PathVariable Integer id){
		return ResponseEntity.ok(servicio.getVentasById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> crearCiudad(@RequestBody Ventas ventas){
		return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crearVenta(ventas));
	}
}
