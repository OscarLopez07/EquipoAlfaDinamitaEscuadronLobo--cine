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
public class Salas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSala;
	
	@Column(name="formato", length=45)
	private String formato;
	
	@Column(name="horario", length=45)
	private String horario;

	public Salas() {
	}

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Salas [idSala=" + idSala + ", formato=" + formato + ", horario=" + horario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(formato, horario, idSala);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salas other = (Salas) obj;
		return Objects.equals(formato, other.formato) && Objects.equals(horario, other.horario)
				&& Objects.equals(idSala, other.idSala);
	}
	

}
