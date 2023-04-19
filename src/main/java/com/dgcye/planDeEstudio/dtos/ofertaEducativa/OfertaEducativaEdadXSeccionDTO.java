package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfertaEducativaEdadXSeccionDTO {
	private Integer idOfertaEducativa;
	private SeccionDTO seccion;
	private PlanEducativoDenominacionDTO edad;
	

}
