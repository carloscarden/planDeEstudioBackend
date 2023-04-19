package com.dgcye.planDeEstudio.dtos.establecimiento;

public enum EstadosModificables {
    ALUMNO_TITULO_INICIAL("INI"),
    ALUMNO_TITULO_RECHAZADO_RAMA("RPR"),
	ALUMNO_TITULO_SIN_INICIAR("SI");	
    
    
	private String descripcion;
	
	private EstadosModificables(String unaDesc) {
		this.descripcion = unaDesc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
}
