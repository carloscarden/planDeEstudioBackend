package com.dgcye.planDeEstudio.dtos.ofertaEducativa;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.dgcye.planDeEstudio.dtos.materias.MateriaOfertaDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfertaEducativaRamaDTO {
	
	/***********************/
	private Integer id;
	private Integer idRama;
	private String titulo;
	private String tituloImpresion;
	private String tituloIntermedio;
	private String tituloIntermedioImpresion;
	private Integer idSeccionTituloIntermedio;
	private String orientacion;
	private Integer idOrientacion;
	private Integer idCursoGrupoNombre;
	private Long idUser;
	private Integer normaAprobacionId;
	private Integer normaDictamenId;
	private Integer seCorrespondeConId;
	private Integer equivalencia26026Id;
	private Integer modalidadId;
	private String observaciones;
	private Integer correlatividad;
	private Integer titula;
	private Integer idModalidadDictado;
	private Date fechaInicio;
	private Date fechaFin;
	private NivelDTO nivel;
	private List<OfertaXTipoOrgDTO> tipoOrgs;
	
	/***********************/
	private Set<MateriaOfertaDTO> materias;
	private List<OfertaEducativaEdadXSeccionDTO> edades;
	private List<OfertaEducativaCalificacionXseccionDTO> calificaciones;
	
	
	



}
