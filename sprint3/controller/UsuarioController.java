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

import com.cine.sprint3.model.Usuario;
import com.cine.sprint3.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService servicio;
	
	@GetMapping
	public ResponseEntity<?> getUsuarios(){
		return ResponseEntity.ok(servicio.getUsuarios());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUsuario(@PathVariable Integer id){
		return ResponseEntity.ok(servicio.getUsuarioById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> crearCiudad(@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crearUsuario(usuario));
	}
}
