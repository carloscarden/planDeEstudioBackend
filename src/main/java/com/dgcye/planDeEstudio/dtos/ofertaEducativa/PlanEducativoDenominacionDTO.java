package com.dgcye.planDeEstudio.dtos.ofertaEducativa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanEducativoDenominacionDTO {
	private Integer id;
	private Integer idAtributo;
	private String descripcion;

}
