package com.dgcye.planDeEstudio.modelEdu.secciones;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.secciones.CursoGrupoNombreDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CURSOGRUPONOMBRE", schema = "ABC")
public class CursoGrupoNombre {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "CODIGO")
	private String codigo;
	
	@Column(name = "IDRAMA")
	private Integer idRama;
	
	@Column(name = "IDALIASCURSO")
	private Integer idAliasCurso;
	
	
	public CursoGrupoNombre(CursoGrupoNombreDTO unCursoGrupoNombre) {
		this.codigo = unCursoGrupoNombre.getCodigo();
		this.descripcion = unCursoGrupoNombre.getDescripcion();
		this.idAliasCurso = unCursoGrupoNombre.getIdAliasCurso();
		this.idRama = unCursoGrupoNombre.getIdRama();
	}


	public void modificarCursoGrupoNombre(CursoGrupoNombreDTO unCursoGrupoNombre) {
		this.codigo = unCursoGrupoNombre.getCodigo();
		this.descripcion = unCursoGrupoNombre.getDescripcion();
		this.idAliasCurso = unCursoGrupoNombre.getIdAliasCurso();
		this.idRama = unCursoGrupoNombre.getIdRama();
	}
}
