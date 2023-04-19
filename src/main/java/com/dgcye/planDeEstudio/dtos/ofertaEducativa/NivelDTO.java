package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import com.dgcye.planDeEstudio.modelEdu.Nivel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NivelDTO {

	private Integer id;
	private String codigo;
	private String descripcion;

	public NivelDTO(Nivel nivel) {

		if (nivel != null) {
			this.id = nivel.getId();
			this.codigo = nivel.getCodigo();
			this.descripcion = nivel.getDescripcion();
		}
	}

}
