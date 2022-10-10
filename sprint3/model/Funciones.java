package com.cine.sprint3.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salas")
public class Funciones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer consecutivo;
	
	/*@Column(name="idsala", length=45)
	private String idSala;*/
	
	@Column(name="id_pelicula", length=45)
	private String idPelicula;

	public Funciones() {
	}

	public Integer getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	/*public String getIdSala() {
		return idSala;
	}

	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}*/

	public String getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(String idPelicula) {
		this.idPelicula = idPelicula;
	}

	
	@Override
	public String toString() {
		return "Funciones [consecutivo=" + consecutivo + ", idSala=" + ", idPelicula=" + idPelicula + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(consecutivo, idPelicula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funciones other = (Funciones) obj;
		return Objects.equals(consecutivo, other.consecutivo) && Objects.equals(idPelicula, other.idPelicula);
	}
	
	
	
	
}
