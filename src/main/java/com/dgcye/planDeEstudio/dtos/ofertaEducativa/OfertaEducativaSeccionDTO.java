package com.dgcye.planDeEstudio.dtos.ofertaEducativa;



import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativaSeccion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfertaEducativaSeccionDTO {
	private Long id;
	private Integer idOfertaEducativa;
	private Integer idSeccion;
	private Integer terminalidad;
	private Integer obligatoriedad;
	

	
	public OfertaEducativaSeccionDTO(OfertaEducativaSeccion oes) {
		// TODO Auto-generated constructor stub
	}

}
