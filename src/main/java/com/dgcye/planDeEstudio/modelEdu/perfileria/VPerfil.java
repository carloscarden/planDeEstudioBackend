package com.dgcye.planDeEstudio.modelEdu.perfileria;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "V_PERFIL_N", schema = "DGE")
public class VPerfil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private VPerfilId vPerfilId;
	
	
	@Column(name="CLAVEESTAB")
	private String claveEstab;
	
	
	@Column(name="DOCUMENTO")
	private String dni;
	
	@Column(name="PERFIL")
    private String perfil;
	
	
	@Column(name="DESCRIPCIONOBJETO")
    private String descripcionObjeto;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="APELLIDO")
    private String apellido;
	
	

}
