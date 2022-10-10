package com.cine.sprint3.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="precios")
public class Precios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="formato", length=45)
	private String valor;

	public Precios() {
	}

	public Integer getIdSala() {
		return id;
	}

	public void setIdSala(Integer idSala) {
		this.id = idSala;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Precios other = (Precios) obj;
		return Objects.equals(id, other.id) && Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "Precios [idSala=" + id + ", valor=" + valor + "]";
	}
	
	
	

}
