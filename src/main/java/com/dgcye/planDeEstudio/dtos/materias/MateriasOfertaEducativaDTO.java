package com.dgcye.planDeEstudio.dtos.materias;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MateriasOfertaEducativaDTO {
	private Integer seccion;
	private List<MateriaOfertaDTO> materias;
	

}
