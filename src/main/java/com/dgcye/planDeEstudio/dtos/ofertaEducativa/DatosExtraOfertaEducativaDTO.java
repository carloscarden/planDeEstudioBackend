package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DatosExtraOfertaEducativaDTO {
	private Integer idOfertaEducativa;
	private Integer modalidadDictado;
	private Integer correlatividad;

}
