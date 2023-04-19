package com.dgcye.planDeEstudio.dtos.ofertaEducativa;



import com.dgcye.planDeEstudio.modelEdu.EstadoOferta;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstadoOfertaDTO {

	
	private Integer id;
	private String codigo;
	private String descripcion;
	private String idTablaDestino;
	
	
	public EstadoOfertaDTO(EstadoOferta estado) {
	
		super();
		this.id = estado.getId();
		this.codigo = estado.getCodigo();
		this.descripcion = estado.getDescripcion();
		this.idTablaDestino = estado.getIdTablaDestino();
	}
}
