package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import com.dgcye.planDeEstudio.modelEdu.Rama;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RamaDTO {

	private Integer id;
	private String codigo;
	private String descripcion;
	private NivelDTO nivel;
	private ModalidadDTO modalidad;
	private Integer ensenanza;
	private Integer dependenciaFuncional;
	private Integer auditoriaTitulo;

	public RamaDTO(Rama rama) {
		this.id = rama.getId();
		this.codigo = rama.getCodigo();
		this.descripcion = rama.getDescripcion();
		if (rama.getNivel() != null) {
			this.nivel = new NivelDTO(rama.getNivel());
		}
		if (rama.getModalidad() != null) {

			this.modalidad = new ModalidadDTO(rama.getModalidad());
		}
		this.ensenanza = rama.getEnsenanza();
		this.dependenciaFuncional = rama.getDependenciaFuncional();
		this.auditoriaTitulo = rama.getAuditoriaTitulo();

	}

}
