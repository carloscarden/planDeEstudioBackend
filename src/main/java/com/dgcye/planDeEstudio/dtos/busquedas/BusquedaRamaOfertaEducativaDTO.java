package com.dgcye.planDeEstudio.dtos.busquedas;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusquedaRamaOfertaEducativaDTO {

	private String titulo;
	private String orientacion;
	private Integer nivel;
	private String ramaResponsable;
	private Integer tipoOrganizacion;
	private Integer estado;

}
