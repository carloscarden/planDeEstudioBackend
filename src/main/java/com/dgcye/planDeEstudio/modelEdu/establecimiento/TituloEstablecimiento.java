package com.dgcye.planDeEstudio.modelEdu.establecimiento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "V_ESTAB_N", schema = "ABC")
public class TituloEstablecimiento {

	@Id
	@Column(name = "IDSER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSer;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "CUE")
	private String cue;

	@Column(name = "CALLE")
	private String calle;

	@ManyToOne
	@JoinColumn(name = "IDDISTRITO", referencedColumnName = "ID")
	private Distrito distrito;

	@Column(name = "NRODIRECCION")
	private String nroDireccion;

	@Column(name = "DESCRLOCALIDAD")
	private String localidad;

	@Column(name = "DESC_DISTRITO")
	private String descripcionDistrito;

	public String getNombreTrim() {
		String aux = "";
		if (nombre != null && !"".equals(nombre.trim())) {
			aux = nombre.trim();
		}
		return aux;
	}
	
	public String getUbicadoEn() {
		return this.getCalle()+this.getNroDireccion();
	}
	
	public String getCiudad() {
		return this.getLocalidad()+distrito.getDescripcionLarga();
	}
	
	
	
	public String getCalle() {
		return  calleVacia() ? " S/N Nº" : this.calle.trim();
	}
	
	private boolean calleVacia() {
		return this.calle == null || "".equals(this.calle);
	}
	
	
	
	public String getNroDireccion() {
		return  direccionVacia() ? " S/N Nº " : this.nroDireccion.trim();
	}

	private boolean direccionVacia() {
		return this.nroDireccion == null || "".equals(this.nroDireccion);
	}

	
	
	
	public String getLocalidad() {
		return  localidadVacia() ? " S/N - " : this.localidad;
	}

	private boolean localidadVacia() {
		return this.localidad == null || "".equals(this.localidad);
	}
	
	

}
