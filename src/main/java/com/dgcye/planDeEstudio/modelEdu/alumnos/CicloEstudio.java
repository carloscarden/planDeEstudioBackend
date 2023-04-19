package com.dgcye.planDeEstudio.modelEdu.alumnos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.secciones.CicloEstudioDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CICLOESTUDIO", schema = "ABC")
public class CicloEstudio {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "CODIGO")
	private String codigo;
	
	@Column(name = "IDRAMA")
	private Integer idRama;
	
	
	public CicloEstudio(CicloEstudioDTO cicloEstudio) {
		this.id = cicloEstudio.getId();
		this.descripcion = cicloEstudio.getDescripcion();
		this.codigo = cicloEstudio.getCodigo();
		this.idRama = cicloEstudio.getIdRama();
		
	}
}
