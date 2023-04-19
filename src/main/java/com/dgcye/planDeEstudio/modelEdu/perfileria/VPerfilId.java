package com.dgcye.planDeEstudio.modelEdu.perfileria;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class VPerfilId implements Serializable{
    
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "IDSER", nullable = false)
	private Integer idSer;
	
	@Column(name = "JERARQUIA", nullable = false)
    private Integer jerarquia;
	
	@Column(name = "IDRAMA", nullable = false)
    private Integer idRama;
	
	@Column(name = "IDPERFIL", nullable = false)
    private Integer idPerfil;
    
}
