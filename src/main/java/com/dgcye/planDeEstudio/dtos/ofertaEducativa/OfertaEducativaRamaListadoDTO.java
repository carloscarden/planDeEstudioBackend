package com.dgcye.planDeEstudio.dtos.ofertaEducativa;


import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfertaEducativaRamaListadoDTO {
	private Integer idOfertaEducativa;
	private Integer idRama;
	private String descripicion;
	private String titulo;
	private String tituloDescripcion;
	private String orientacion;
	private String normaAprobacion;
	private String estadoDescripcion;
	private String estadoCodigo;

	public OfertaEducativaRamaListadoDTO(OfertaEducativa oferta) {
		this.idOfertaEducativa = oferta.getId();
		this.idRama= oferta.getIdRama();
		
		String rama = "SIN RAMA";
		if (oferta.getNivel() != null) {
			rama = oferta.getNivel().getDescripcion();
		}

		if (oferta.getModalidad() != null) {
			rama = oferta.getModalidad().getDescripcion();
		}
		this.descripicion = rama;

		if (oferta.getTitulo() != null) {
			this.titulo = oferta.getTitulo();
		} else {
			this.titulo = "";
		}
		if (oferta.getOrientacion() != null) {
			this.orientacion = oferta.getOrientacion();
		} else {
			this.orientacion = "";
		}

		if (oferta.getNormaAprobacion() != null) {
			this.normaAprobacion = oferta.getNormaAprobacion().getDescripcion();
		} else {

			this.normaAprobacion = "SIN RESOLUCIÓN";
		}

		if (oferta.getEstado() != null) {
			this.estadoDescripcion = oferta.getEstado().getDescripcion();
			this.estadoCodigo =oferta.getEstado().getCodigo();
		} else {
			this.estadoDescripcion = "SIN ESTADO";
		}
		
    	//genero el string del titulo
    	this.tituloDescripcion= "TITULO: "+oferta.getTituloDescripcion();    	
    			
    	if(oferta.getNormaAprobacion()!=null 
    			&& !"".equals(oferta.getNormaAprobacion().getDescripcion())){
    		this.tituloDescripcion+=" ("+oferta.getNormaAprobacion().getDescripcion()+")";
    	};
	
	}

}
