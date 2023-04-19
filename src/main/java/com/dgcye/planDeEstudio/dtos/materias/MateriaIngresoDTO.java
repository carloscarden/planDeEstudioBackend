package com.dgcye.planDeEstudio.dtos.materias;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.MateriaIngreso;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MateriaIngresoDTO {
	
	private Integer id;
	private String codigo;
	private String descripcion;

	
	public MateriaIngresoDTO(MateriaIngreso mi) {
		this.id = mi.getId();
		this.codigo = mi.getCodigo();
		this.descripcion = mi.getDescripcion();
	}

}
