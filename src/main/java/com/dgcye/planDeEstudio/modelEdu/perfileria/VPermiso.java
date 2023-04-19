package com.dgcye.planDeEstudio.modelEdu.perfileria;

import java.io.Serializable;

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
@Table(name = "V_PERMISO", schema = "DGE")
public class VPermiso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private VPermisoId vPermisoId;

}
