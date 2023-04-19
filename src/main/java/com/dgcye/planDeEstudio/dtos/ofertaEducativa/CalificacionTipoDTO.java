package com.dgcye.planDeEstudio.dtos.ofertaEducativa;



import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.CalificacionTipo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalificacionTipoDTO {
	private Integer id;
	private String nombre;

	public CalificacionTipoDTO(CalificacionTipo c) {
		this.id = c.getId();
		this.nombre = c.getNombre();
	}

}
