package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.Seccion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeccionDTO {
	private Integer id;
	private String grado;
	private String descripcion;
	
	public SeccionDTO(Seccion secuencia) {
		this.id = secuencia.getId();
		this.grado = secuencia.getGrado();
		this.descripcion = secuencia.getDescripcion();
	}

}
