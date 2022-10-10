package com.cine.sprint3.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartelera")
public class Cartelera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPelicula;
	
	@Column(name="nombre_pelicula", length=45)
	private String nombrePelicula;
	
	@Column(name="genero", length=45)
	private String genero;
	
	@Column(name="duracion", length=45)
	private String duracion;

	public Cartelera() {
		
	}

	public Integer getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, genero, idPelicula, nombrePelicula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartelera other = (Cartelera) obj;
		return Objects.equals(duracion, other.duracion) && Objects.equals(genero, other.genero)
				&& Objects.equals(idPelicula, other.idPelicula) && Objects.equals(nombrePelicula, other.nombrePelicula);
	}

	@Override
	public String toString() {
		return "Cartelera [idPelicula=" + idPelicula + ", nombrePelicula=" + nombrePelicula + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}
	
	
	
	
	
	
}
