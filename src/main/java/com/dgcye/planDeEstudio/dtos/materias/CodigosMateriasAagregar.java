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
public class CodigosMateriasAagregar {

	private Integer idMateria;
	private List<Integer> idsMateriaIngreso;
	
}
