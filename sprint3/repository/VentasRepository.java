package com.cine.sprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cine.sprint3.model.Ventas;

public interface VentasRepository extends JpaRepository<Ventas, Integer> {
	
}
