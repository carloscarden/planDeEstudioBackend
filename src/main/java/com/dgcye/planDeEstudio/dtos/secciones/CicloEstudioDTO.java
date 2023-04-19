package com.dgcye.planDeEstudio.dtos.secciones;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CicloEstudioDTO {
	
	private Integer id;
	private String descripcion;
	private String codigo;
	private Integer idRama;

	public CicloEstudioDTO(CicloEstudio cicloEstudio) {
		this.id = cicloEstudio.getId();
		this.descripcion = cicloEstudio.getDescripcion();
		this.codigo = cicloEstudio.getCodigo();
		this.idRama = cicloEstudio.getIdRama();
	}

}
