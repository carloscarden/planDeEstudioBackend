package com.dgcye.planDeEstudio.dtos.mensajesDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MensajeEstadoCorrecto {
	private String mensajeExitoso;
	private String codigo;

}
