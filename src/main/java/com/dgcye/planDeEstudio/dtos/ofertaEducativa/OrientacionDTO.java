package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.Orientacion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrientacionDTO {

	private Integer id;
	private String codigo;
	private String descripcion;
	
	
	public OrientacionDTO(Orientacion oe) {
		this.id = oe.getId();
		this.codigo = oe.getCodigo();
		this.descripcion = oe.getDescripcion();
	}
	
}
