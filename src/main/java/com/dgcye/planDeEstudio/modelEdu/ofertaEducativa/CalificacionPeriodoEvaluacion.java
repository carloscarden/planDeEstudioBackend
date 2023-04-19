package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.CalificacionPeriodosEvaluacionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CALIFICACION_PERIODO_EVALUACION", schema = "ABC")
public class CalificacionPeriodoEvaluacion {
	

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "CANTIDAD_PERIODOS")
	private Integer cantidadPeriodos;

	
	
	public CalificacionPeriodoEvaluacion(CalificacionPeriodosEvaluacionDTO periodoEvaluacion) {
		this.id = periodoEvaluacion.getId();
		this.nombre = periodoEvaluacion.getNombre();
		this.cantidadPeriodos = periodoEvaluacion.getCantidadPeriodos();
	}
}
