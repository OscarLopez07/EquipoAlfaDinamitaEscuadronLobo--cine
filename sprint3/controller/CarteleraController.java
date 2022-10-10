package com.cine.sprint3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cine.sprint3.model.Cartelera;
import com.cine.sprint3.service.CarteleraService;



@RestController
@RequestMapping("/api/cartelera")
public class CarteleraController {
	@Autowired
	private CarteleraService servicio;
	
	@GetMapping
	public ResponseEntity<?> getCartelera(){
		return ResponseEntity.ok(servicio.getCartelera());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getPeliculaCartelera(@PathVariable Integer id){
		return ResponseEntity.ok(servicio.getCarteleraById(id));
	} 
	
	@PostMapping
	public ResponseEntity<?> crearCartelera(@RequestBody Cartelera cartelera){
		return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crearCartelera(cartelera));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCartelera(@PathVariable Integer id){
		Optional<Cartelera> cartelera = servicio.getCarteleraById(id);
		if(!cartelera.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		servicio.eliminarCartelera(id);
		return ResponseEntity.ok().build();
	}
}
