package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.TipoOrganizacion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoOrganizacionDTO {
	
	private Integer id;
	private String codigo;
	private String descripcion;
	private Integer idEnsenanza;
	private Integer idEnsenanzaIngreso;
	private String establecimientoEducativo;


	public TipoOrganizacionDTO(TipoOrganizacion t) {
		this.id = t.getId();
		this.codigo = t.getCodigo();
		this.descripcion = t.getDescripcion();
		this.establecimientoEducativo = t.getEstablecimientoEducativo();
		this.idEnsenanza = t.getIdEnsenanza();
		this.idEnsenanzaIngreso = t.getIdEnsenanzaIngreso();
	}

}
