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

import com.cine.sprint3.model.Funciones;
import com.cine.sprint3.service.FuncionesServices;


@RestController
@RequestMapping("/api/funciones")
public class FuncionesController {

	@Autowired
	private FuncionesServices servicio;
	
	@GetMapping
	public ResponseEntity<?> getFunciones(){
		return ResponseEntity.ok(servicio.getFunciones());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCiudad(@PathVariable Integer id){
		return ResponseEntity.ok(servicio.getFuncionesById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> crearCiudad(@RequestBody Funciones funciones){
		return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crearFunciones(funciones));
	}
}
