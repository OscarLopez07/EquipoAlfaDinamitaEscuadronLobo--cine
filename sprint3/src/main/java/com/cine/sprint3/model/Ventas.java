package com.cine.sprint3.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class Ventas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer consecutivo;
	
	@Column(name="id_usuario")
	private Integer idUsuario;
	
	@Column(name="cantidad_entradas")
	private Integer cantidadEntradas;
	
	/*@Column(name="idsala", length=45)
	private Integer idSala;*/
	
	@Column(name="nombre_pelicula", length=45)
	private Integer nombrePelicula;
	
	@Column(name="total", length=45)
	private Integer total;

	public Ventas() {
	}

	public Integer getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getCantidadEntradas() {
		return cantidadEntradas;
	}

	public void setCantidadEntradas(Integer cantidadEntradas) {
		this.cantidadEntradas = cantidadEntradas;
	}

	/*public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}*/

	public Integer getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(Integer nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Ventas [consecutivo=" + consecutivo + ", idUsuario=" + idUsuario + ", cantidadEntradas="
				+ cantidadEntradas + ", idSala="  + ", nombrePelicula=" + nombrePelicula + ", total=" + total
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidadEntradas, consecutivo, idUsuario, nombrePelicula, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ventas other = (Ventas) obj;
		return Objects.equals(cantidadEntradas, other.cantidadEntradas)
				&& Objects.equals(consecutivo, other.consecutivo)
				&& Objects.equals(idUsuario, other.idUsuario) && Objects.equals(nombrePelicula, other.nombrePelicula)
				&& Objects.equals(total, other.total);
	}
	
	
	

	
}
