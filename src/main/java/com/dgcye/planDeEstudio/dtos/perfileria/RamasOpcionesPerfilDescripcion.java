package com.dgcye.planDeEstudio.dtos.perfileria;

public enum RamasOpcionesPerfilDescripcion {

	ADMINISTRADOROFERTA("Administrador de "),
	IMPRESION_TITULOS("Impresion de ");
	
	private String descripcion;
	
	private RamasOpcionesPerfilDescripcion(String unaDescripcion) {
		this.descripcion = unaDescripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
