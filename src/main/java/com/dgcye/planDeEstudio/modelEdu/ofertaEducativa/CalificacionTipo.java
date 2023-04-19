package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.CalificacionTipoDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CALIFICACION_TIPO", schema = "ABC")
public class CalificacionTipo {
	


	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	

	@Column(name = "NOMBRE")
	private String nombre;
	
	
	public CalificacionTipo(CalificacionTipoDTO tipoCalificacion) {
		this.id = tipoCalificacion.getId();
		this.nombre = tipoCalificacion.getNombre();
	}
}
