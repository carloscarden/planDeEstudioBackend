package com.dgcye.planDeEstudio.dtos.ofertaEducativa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfertaEducativaCalificacionXseccionDTO {
	private Long id;
	private Integer idOfertaEducativa;
	private SeccionDTO seccion;
	private CalificacionMetodoDTO calificacion;	

}
