package com.dgcye.planDeEstudio.dtos.ofertaEducativa;



import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.CalificacionMetodo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalificacionMetodoDTO {

	private Long idCalificacion;
	private String nombre;
	private CalificacionPeriodosEvaluacionDTO periodoEvaluacion;
	private CalificacionTipoDTO tipoCalificacion;
	private Integer idRama;
	private Integer cantidadCalificacionesXPeriodo;
	private String calificacionesPosibles;
	
	public CalificacionMetodoDTO(CalificacionMetodo c, String califsPosibles) {
		this.idCalificacion = c.getId();
		this.periodoEvaluacion = new CalificacionPeriodosEvaluacionDTO(c.getPeriodoEvaluacion());
		this.tipoCalificacion = new CalificacionTipoDTO(c.getTipo());
		this.idRama = c.getIdRama();
		this.cantidadCalificacionesXPeriodo = c.getCantidadCalificacionesXPeriodo();
		this.calificacionesPosibles = califsPosibles;
	}

}
