package com.dgcye.planDeEstudio.dtos.perfileria;


import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpcionPerfilRamaDTO extends OpcionPerfilDTO {
	
	private BigInteger idPerfil;
	private Integer idRama;

	public void llenarOpcionRama(Object[] perfil) {
		
		this.idPerfil = (BigInteger) perfil[0];
		this.idRama = (Integer) perfil[2];
		
		RamasOpcionesPerfilDescripcion r = 
				Enum.valueOf(RamasOpcionesPerfilDescripcion.class, ((String) perfil[1]).toUpperCase());
		this.setDescripcion( r.getDescripcion()+ (String) perfil[3]);
	}


}
