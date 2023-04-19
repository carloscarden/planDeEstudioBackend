package com.dgcye.planDeEstudio.dtos.ofertaEducativa;



import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.CalificacionPeriodoEvaluacion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalificacionPeriodosEvaluacionDTO {
	private Integer id;
	private String nombre;
	private Integer cantidadPeriodos;

	public CalificacionPeriodosEvaluacionDTO(CalificacionPeriodoEvaluacion c) {
		this.id = c.getId();
		this.nombre = c.getNombre();
		this.cantidadPeriodos = c.getCantidadPeriodos();
	}

}
