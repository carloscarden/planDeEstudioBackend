package com.dgcye.planDeEstudio.dtos;



import com.dgcye.planDeEstudio.modelEdu.Materia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MateriaDTO {
	private Long idMateria;
	private String orden;
	private Float nota;
	private String condicion;
	private String mes;
	private String anio;
	private String estab;
	private Long idAnalitico;
	
	
	
	public MateriaDTO(Materia m) {
		// TODO Auto-generated constructor stub
	}

}
