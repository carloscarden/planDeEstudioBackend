package com.dgcye.planDeEstudio.modelEdu.perfileria;

public enum RamaTiposPerfilDescripcion {

	ADMINISTRADOROFERTA("Administrador rama"),
	IMPRESION_TITULOS("Administrador rama"),
	SUPER_ADMIN_ESTAB("Super administrador");
	
	private String descripcion;
	
	RamaTiposPerfilDescripcion(String unaDescripcion) {
	
		this.descripcion = unaDescripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
