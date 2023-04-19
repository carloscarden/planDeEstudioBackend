package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MateriaOfertaMateriaIngresoDTO {
	private Integer idMateria;
	private Integer idMateriaIngreso;
	private Float cargaHoraria;
	private Boolean divisiblePofa;

}
