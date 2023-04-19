package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MATERIADENOMINACION", schema = "ABC")
public class MateriaDenominacion {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "CODIGO")
	private String codigo;

	@Column(name = "DESCRIPCION")
	@NotNull
	private String descripcion;

	public MateriaDenominacion(MateriaDenominacionDTO unaMateriaDenominacion) {
		this.id = unaMateriaDenominacion.getId();
		this.codigo = unaMateriaDenominacion.getCodigo();
		this.descripcion = unaMateriaDenominacion.getDescripcion();
	}

	public void modificarMateriaDenominacion(MateriaDenominacionDTO unaMateriaDenominacion) {
		this.id = unaMateriaDenominacion.getId();
		this.codigo = unaMateriaDenominacion.getCodigo();
		this.descripcion = unaMateriaDenominacion.getDescripcion();
	}
}
