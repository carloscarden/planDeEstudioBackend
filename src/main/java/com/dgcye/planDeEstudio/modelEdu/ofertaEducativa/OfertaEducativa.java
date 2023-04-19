package com.dgcye.planDeEstudio.modelEdu.ofertaEducativa;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.OfertaEducativaRamaDTO;
import com.dgcye.planDeEstudio.modelEdu.EstadoOferta;
import com.dgcye.planDeEstudio.modelEdu.Materia;
import com.dgcye.planDeEstudio.modelEdu.Modalidad;
import com.dgcye.planDeEstudio.modelEdu.Nivel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OFERTAEDUCATIVA", schema = "ABC")
public class OfertaEducativa {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "IDESTADOOFERTA", referencedColumnName = "ID")
	private EstadoOferta estado;

	@ManyToOne
	@JoinColumn(name = "IDMODALIDAD", referencedColumnName = "ID")
	private Modalidad modalidad;

	@ManyToOne
	@JoinColumn(name = "IDNIVEL", referencedColumnName = "ID")
	private Nivel nivel;

	@Column(name = "ORIENTACION")
	private String orientacion;

	@Column(name = "TITULO")
	private String titulo;

	@Column(name = "TITULOIMPRESION")
	private String tituloImpresion;

	@Column(name = "TITULOINTERMEDIO")
	private String tituloIntermedio;

	@Column(name = "TITULOINTERMEDIOIMPRESION")
	private String tituloIntermedioImpresion;

	@Column(name = "IDSECCIONTITULOINTERMEDIO")
	private Integer idSeccionTituloIntermedio;

	@Column(name = "IDRAMA")
	private Integer idRama;

	@Column(name = "IDORIENTACION")
	private Integer idOrientacion;

	@Column(name = "IDCURSOGRUPONOMBRE")
	private Integer idCursoGrupoNombre;

	@Column(name = "CORRELATIVIDAD")
	private Integer correlatividad;

	@Column(name = "IDMODALIDADDICTADO")
	private Integer idModalidadDictado;

	@ManyToOne
	@JoinColumn(name = "IDNORMAAPROBACIONDEN", referencedColumnName = "ID")
	private PlanEducativoDenominacion normaAprobacion;

	@ManyToOne
	@JoinColumn(name = "IDNORMADICTAMENDEN", referencedColumnName = "ID")
	private PlanEducativoDenominacion normaDictamen;

	@ManyToOne
	@JoinColumn(name = "IDSECORRESPONDECON", referencedColumnName = "ID")
	private PlanEducativoDenominacion seCorrespondeCon;

	@ManyToOne
	@JoinColumn(name = "IDLEYEDUCACION", referencedColumnName = "ID")
	private PlanEducativoDenominacion equivalencia26026;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "FECHAINICIO")
	private Date fechaInicio;

	@Column(name = "FECHAFIN")
	private Date fechaFin;

	@Column(name = "FECHAESTADO")
	private Date fechaEstado;

	@Column(name = "IDUSER")
	private Long idUser;

	@Column(name = "TITULA")
	private Integer titula;
	
	@OneToMany(mappedBy = "ofertaEducativa", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Materia> materias = new HashSet<>();	


	public String getTituloDescripcion() {
		String tituloDesc = this.getTitulo();
		if (this.getOrientacion() != null && !"".equals(this.getOrientacion())) {
			tituloDesc = tituloDesc + " - ORIENTACIÓN: " + this.getOrientacion();
		}
		return tituloDesc;
	}

	public String devolverEquivalencia26026() {
		return this.getEquivalencia26026().getDescripcion().toUpperCase();

	}

	public String getNormaPlan() {
		String retorno;
		if (this.normaAprobacion != null) {
			retorno = this.normaAprobacion.getDescripcion().toUpperCase();
		} else {
			retorno = "---------------------------------";
		}
		;
		return retorno;
	}

	public String normaDictamen() {
		String retorno;
		if (this.normaDictamen != null) {
			retorno = this.normaDictamen.getDescripcion().toUpperCase();
		} else {
			retorno = "---------------------------------";
		}
		;
		return retorno;
	}

	public String getCorrespondenciaTitulo() {
		String retorno="";
		if (this.seCorrespondeCon != null) {
			retorno = retorno + this.seCorrespondeCon.getDescripcion().toUpperCase();
		} else {
			retorno = retorno + "---------------------------------";
		}
		;
		return retorno;
	}

	public String nombreTituloImpresion() {
		return this.tituloImpresion.toUpperCase();
	}

	public void llenarDatos(OfertaEducativaRamaDTO unaOfertaEducativa) {
		this.idRama = unaOfertaEducativa.getIdRama();
		this.titulo = unaOfertaEducativa.getTitulo();
		this.tituloImpresion = unaOfertaEducativa.getTituloImpresion();
		this.tituloIntermedio = unaOfertaEducativa.getTituloIntermedio();
		this.tituloIntermedioImpresion = unaOfertaEducativa.getTituloIntermedioImpresion();
		this.idSeccionTituloIntermedio = unaOfertaEducativa.getIdSeccionTituloIntermedio();
		this.orientacion = unaOfertaEducativa.getOrientacion();
		this.idOrientacion = unaOfertaEducativa.getIdOrientacion();
		this.idCursoGrupoNombre = unaOfertaEducativa.getIdCursoGrupoNombre();
		this.idUser = unaOfertaEducativa.getIdUser();
	}

	public void llenarDatosPlanesEducativoDenominacion(OfertaEducativaRamaDTO unaOfertaEducativa) {
		
		PlanEducativoDenominacion unaEquivalencia26026 = new PlanEducativoDenominacion();
		unaEquivalencia26026.setId(unaOfertaEducativa.getEquivalencia26026Id());
		this.equivalencia26026 = unaEquivalencia26026;
		
		PlanEducativoDenominacion unaNormaDictamen = new PlanEducativoDenominacion();
		unaNormaDictamen.setId(unaOfertaEducativa.getNormaDictamenId());
		this.normaDictamen = unaNormaDictamen;
		
		PlanEducativoDenominacion unaNormaAprobacion = new PlanEducativoDenominacion();
		unaNormaAprobacion.setId(unaOfertaEducativa.getNormaAprobacionId());
		this.normaAprobacion = unaNormaAprobacion;
		
		PlanEducativoDenominacion unSeCorrespondeCon = new PlanEducativoDenominacion();
		unSeCorrespondeCon.setId(unaOfertaEducativa.getEquivalencia26026Id());
		this.seCorrespondeCon = unSeCorrespondeCon;
		
		
	}

	public void llenarModalidad(Integer modalidadId) {
		Modalidad m = new Modalidad();
		m.setId(modalidadId);
		this.modalidad = m;
		
	}

	public OfertaEducativa duplicar() {
		OfertaEducativa oferta=new OfertaEducativa();
		oferta.setTitulo(this.getTitulo()+" (COPIA)");
		oferta.setTituloImpresion(this.getTituloImpresion());
		oferta.setTituloIntermedio(this.getTituloIntermedio());
		oferta.setTituloIntermedioImpresion(this.getTituloIntermedioImpresion());
		oferta.setIdRama(this.getIdRama());
		oferta.setOrientacion(this.getOrientacion());
		oferta.setIdSeccionTituloIntermedio(this.getIdSeccionTituloIntermedio());
		
		oferta.setFechaInicio(this.getFechaInicio());
		oferta.setFechaFin(this.getFechaFin());

	    oferta.setFechaEstado(new Date());
	    oferta.setSeCorrespondeCon(this.getSeCorrespondeCon());
	    oferta.setEquivalencia26026(this.getEquivalencia26026());
	    oferta.setNormaAprobacion(this.getNormaAprobacion());
	    oferta.setNormaDictamen(this.getNormaDictamen());
		oferta.setModalidad(this.getModalidad());
		oferta.setNivel(this.getNivel());

		oferta.setObservaciones(this.getObservaciones());
		oferta.setEstado(this.getEstado());
		oferta.setIdUser(this.getIdUser());
		
		oferta.setIdOrientacion(this.getIdOrientacion());
		return oferta;

	}

}
