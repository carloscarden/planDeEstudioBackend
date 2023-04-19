package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.CalificacionMetodoDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CALIFICACION_METODO", schema = "ABC")
public class CalificacionMetodo {
	

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "ID_PERIODO_EVALUACION", referencedColumnName = "ID")
	@NotNull
	private CalificacionPeriodoEvaluacion periodoEvaluacion;
	
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_CALIFICACION", referencedColumnName = "ID")
	@NotNull
	private CalificacionTipo tipo;
	
	
	@Column(name = "CANT_CALIF_X_PERIODO")
	private Integer cantidadCalificacionesXPeriodo;
	
	@Column(name = "ID_RAMA")
	private Integer idRama;

	
	
	public CalificacionMetodo(CalificacionMetodoDTO calificacionMetodo) {
		this.id = calificacionMetodo.getIdCalificacion();
		this.nombre = calificacionMetodo.getNombre();
		this.idRama = calificacionMetodo.getIdRama();
		this.cantidadCalificacionesXPeriodo = calificacionMetodo.getCantidadCalificacionesXPeriodo();
		this.tipo = new CalificacionTipo(calificacionMetodo.getTipoCalificacion());
		this.periodoEvaluacion = 
				new CalificacionPeriodoEvaluacion(calificacionMetodo.getPeriodoEvaluacion());
	}



	public void modificarMetodoCalificacion(CalificacionMetodoDTO calificacionMetodo) {
		this.nombre = calificacionMetodo.getNombre();
		this.idRama = calificacionMetodo.getIdRama();
		this.cantidadCalificacionesXPeriodo = calificacionMetodo.getCantidadCalificacionesXPeriodo();
		this.tipo = new CalificacionTipo(calificacionMetodo.getTipoCalificacion());
		this.periodoEvaluacion =
				new CalificacionPeriodoEvaluacion(calificacionMetodo.getPeriodoEvaluacion());
	}

}
