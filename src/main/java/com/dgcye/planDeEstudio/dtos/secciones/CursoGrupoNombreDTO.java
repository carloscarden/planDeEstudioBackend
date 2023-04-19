package com.dgcye.planDeEstudio.dtos.secciones;

import com.dgcye.SistemaTitulos.modelEDU.secciones.CursoGrupoNombre;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CursoGrupoNombreDTO {
	private Integer id;
	private String descripcion;
	private String codigo;
	private Integer idRama;
	private Integer idAliasCurso;

	
	public CursoGrupoNombreDTO(CursoGrupoNombre c) {
		this.id = c.getId();
		this.descripcion = c.getDescripcion();
		this.codigo = c.getCodigo();
		this.idRama = c.getIdRama();
		this.idAliasCurso = c.getIdAliasCurso();
	}
}
