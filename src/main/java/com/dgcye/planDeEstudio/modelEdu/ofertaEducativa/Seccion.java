package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.SeccionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SECCION", schema = "ABC")
public class Seccion {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "GRADO")
	private String grado;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	public String getDescripcionSeccion() {
		return this.getGrado()+"Nº (AÑO " + this.getDescripcion() + ")";
	}

	public Seccion(SeccionDTO secuencia) {
		this.grado = secuencia.getGrado();
		this.descripcion = secuencia.getDescripcion();
		this.id = secuencia.getId();
	}
}
