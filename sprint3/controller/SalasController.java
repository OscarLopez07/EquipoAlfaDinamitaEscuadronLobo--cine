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

import com.cine.sprint3.model.Salas;
import com.cine.sprint3.service.SalasServices;

@RestController
@RequestMapping("/api/salas")
public class SalasController {
	@Autowired
	private SalasServices servicio;
	
	@GetMapping
	public ResponseEntity<?> getSalas(){
		return ResponseEntity.ok(servicio.getSalas());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getSala(@PathVariable Integer id){
		return ResponseEntity.ok(servicio.getSalaById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> crearCiudad(@RequestBody Salas sala){
		return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crearSala(sala));
	}

}
