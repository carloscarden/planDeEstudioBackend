package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.OfertaEducativaSeccionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OFERTAEDUCATIVASECCION", schema = "ABC")
public class OfertaEducativaSeccion {
	


	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "IDOFERTAEDUCATIVA")
	private Integer idOfertaEducativa;
	
	@ManyToOne
	@JoinColumn(name = "IDSECCION", referencedColumnName = "ID")
	@NotNull
	private Seccion seccion;
	
	
	@Column(name = "TERMINALIDAD")
	private Integer terminalidad;
	
	
	@Column(name = "OBLIGATORIEDAD")
	private Integer obligatoriedad;
	
	
	
	public OfertaEducativaSeccion(OfertaEducativaSeccionDTO unaOESeccion, Seccion s) {
		this.idOfertaEducativa = unaOESeccion.getIdOfertaEducativa();
		this.seccion = s;
		this.terminalidad = unaOESeccion.getTerminalidad();
		this.obligatoriedad = unaOESeccion.getObligatoriedad();
		
	}


	public void modificar(OfertaEducativaSeccionDTO unaOESeccion, Seccion s) {
		this.idOfertaEducativa = unaOESeccion.getIdOfertaEducativa();
		this.seccion = s;
		this.terminalidad = unaOESeccion.getTerminalidad();
		this.obligatoriedad = unaOESeccion.getObligatoriedad();
	
		
	}



}
