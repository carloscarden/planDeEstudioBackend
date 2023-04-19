package com.dgcye.planDeEstudio.modelEdu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.establecimiento.EstadosModificables;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ESTADOOFERTA", schema = "ABC")
public class EstadoOferta {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "CODIGO")
	private String codigo;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "IDTABLADESTINO")
	private String idTablaDestino;

	public boolean enEstadoModificable() {
		return this.codigo.equals(EstadosModificables.ALUMNO_TITULO_INICIAL.getDescripcion()) 
				|| this.codigo.equals(EstadosModificables.ALUMNO_TITULO_RECHAZADO_RAMA.getDescripcion())
				|| this.codigo.equals(EstadosModificables.ALUMNO_TITULO_SIN_INICIAR.getDescripcion());
	}

}
