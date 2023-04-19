package com.dgcye.planDeEstudio.dtos.secciones;


import com.dgcye.planDeEstudio.dtos.ofertaEducativa.SeccionDTO;
import com.dgcye.planDeEstudio.modelEdu.secciones.CursoGrupo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CursoGrupoDTO {
	private Integer id;
	private String codigo; 
	private String descripcion;
	private SeccionDTO secuencia;
	private Integer edad;
	private Integer idCursoGrupoNombre;
	private CicloEstudioDTO cicloEstudio;
	private String leyendaPlanilla;
	

	public CursoGrupoDTO(CursoGrupo c) {
		this.id = c.getId();
		this.codigo = c.getCodigo();
		this.descripcion = c.getDescripcion();
		this.secuencia = new SeccionDTO(c.getSecuencia());
		this.edad = c.getEdad();
		this.idCursoGrupoNombre = c.getIdCursoGrupoNombre();
		this.cicloEstudio = new CicloEstudioDTO(c.getCicloEstudio());
		this.leyendaPlanilla = c.getLeyendaPlanilla();
	}

}
