package com.dgcye.planDeEstudio.modelEdu.establecimiento;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "DISTRITO", schema = "ABC")
public class Distrito {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "NUMERODISTRITO")
	private String codigo;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "DESC_LARGA")
	private String descripcionLarga;
	
	@Column(name = "IDREGION")
	private Integer idRegion;	
	
	public String getDescripcionLarga() {
		return descripcionLargaVacia() ? "S/N" : this.descripcionLarga;
	}

	private boolean descripcionLargaVacia() {
		return this.descripcionLarga == null || "".equals(this.descripcionLarga);
	};

}
