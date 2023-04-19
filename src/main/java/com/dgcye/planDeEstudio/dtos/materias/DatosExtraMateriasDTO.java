package com.dgcye.planDeEstudio.dtos.materias;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DatosExtraMateriasDTO {
	private Integer idMateria;
	private Integer tipoMateria;
	private Integer unidadCargaPedagogica;
	private Integer obligatoriedad;
	
	

}
