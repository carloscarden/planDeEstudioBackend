package com.dgcye.planDeEstudio.dtos.ofertaEducativa;

import com.dgcye.planDeEstudio.modelEdu.Modalidad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModalidadDTO {
	
	private Integer id;
	private String codigo;
	private String descripcion;

	public ModalidadDTO(Modalidad modalidad) {
		this.id = modalidad.getId();
		this.codigo = modalidad.getCodigo();
		this.descripcion = modalidad.getDescripcion();
	}

}
