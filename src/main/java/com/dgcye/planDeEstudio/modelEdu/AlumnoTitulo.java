package com.dgcye.planDeEstudio.modelEdu;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.dgcye.planDeEstudio.dtos.establecimiento.AlumnoTituloDTO;
import com.dgcye.planDeEstudio.dtos.establecimiento.EstablecimientoImpresionDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ALUMNOTITULO", schema = "ABC")
public class AlumnoTitulo {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "IDESTADOALUMNOTITULO", referencedColumnName = "ID")
	private EstadoOferta estado;

	@Column(name = "IDALUMNOESTABOFERTA")
	private Integer idAlumnoEstabOferta;

	@Column(name = "VALIDEZNACIONAL")
	private String validezNacional;

	@Column(name = "NUMERORFIFD")
	private String numeroRfifd;

	@Column(name = "NROSERIE")
	private String nroSerie;

	@Column(name = "FECHAEGRESO")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fechaEgreso;

	@Column(name = "FECHAENVIO")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fechaEnvio;

	@Column(name = "FECHAULTIMOESTADO")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fechaUltimoEstado;

	@Column(name = "NROLIBROMATRIZ")
	private Integer nroLibroMatriz;

	@Column(name = "NROACTA")
	private Integer nroActa;

	@Column(name = "NROFOLIO")
	private Integer nroFolio;

	@Column(name = "ESTABNOMBRE")
	private String estabNombre;

	@Column(name = "ESTABCUE")
	private String estabCue;

	@Column(name = "ESTABUBICADOEN")
	private String estabUbicadoEn;

	@Column(name = "ESTABCIUDAD")
	private String estabCiudad;

	@Column(name = "TITULOINTERMEDIO")
	private Integer tituloIntermedio;

	@Column(name = "PROMEDIO")
	private String promedio;

	@Column(name = "IDRAMARUTA")
	private Integer idRamaRuta;

	@Column(name = "FECHARUTA")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fechaRuta;

	@Column(name = "APYNOMLISTOPARAENVIAR")
	private String apynomListoParaEnviar;

	@Column(name = "DOCUMENTOLISTOPARAENVIAR")
	private String documentoListoParaEnviar;

	@Column(name = "APYNOMENVIADO")
	private String apynomEnviado;

	@Column(name = "DOCUMENTOENVIADO")
	private String documentoEnviado;

	@Column(name = "ESTABPROVINCIA")
	private String estabProvincia;

	public void guardarDatos(AlumnoTituloDTO unAlumnoTitulo, EstadoOferta estadoOferta, EstablecimientoImpresionDTO e) {
		// datos titulo a cargar
		this.setPromedio(unAlumnoTitulo.getPromedio());
		this.setTituloIntermedio(unAlumnoTitulo.getTituloIntermedio());
		this.setObservaciones(unAlumnoTitulo.getObservaciones());
		this.setNumeroRfifd(unAlumnoTitulo.getNumeroRfifd());
		this.setValidezNacional(unAlumnoTitulo.getValidezNacional());
		this.setFechaEgreso(unAlumnoTitulo.getFechaEgreso());
		if (unAlumnoTitulo.getNroActa() != null && unAlumnoTitulo.getNroActa() != 0) {
			this.setNroActa(unAlumnoTitulo.getNroActa());
		} else {
			this.setNroActa(null);
		}
		this.setNroFolio(unAlumnoTitulo.getNroFolio());
		this.setNroLibroMatriz(unAlumnoTitulo.getNroLibroMatriz());

		// datos estab a cargar
		this.setEstabCiudad(e.getCiudad());
		this.setEstabProvincia(e.getProvincia());
		this.setEstabNombre(e.getNombreEstab());
		this.setEstabUbicadoEn(e.getDireccion());
		this.setEstabCue(e.getCueNro());

		// datos estado
		this.setEstado(estadoOferta);
		this.setFechaUltimoEstado(new Date());
		this.setIdAlumnoEstabOferta(unAlumnoTitulo.getIdAlumnoEstabOferta());
	}

	public void modificar(AlumnoTituloDTO unAlumnoTitulo, EstablecimientoImpresionDTO e) {
		this.setPromedio(unAlumnoTitulo.getPromedio());
		this.setTituloIntermedio(unAlumnoTitulo.getTituloIntermedio());
		this.setObservaciones(unAlumnoTitulo.getObservaciones());
		this.setNumeroRfifd(unAlumnoTitulo.getNumeroRfifd());
		this.setValidezNacional(unAlumnoTitulo.getValidezNacional());
		this.setFechaEgreso(unAlumnoTitulo.getFechaEgreso());
		this.setEstabCiudad(unAlumnoTitulo.getEstabCiudad());
		this.setEstabProvincia(unAlumnoTitulo.getEstabProvincia());
		this.setEstabNombre(unAlumnoTitulo.getEstabNombre());
		this.setEstabUbicadoEn(unAlumnoTitulo.getEstabUbicadoEn());
		this.setEstabCue(unAlumnoTitulo.getEstabCue());

		if (unAlumnoTitulo.getNroActa() != null && unAlumnoTitulo.getNroActa() != 0) {
			this.setNroActa(unAlumnoTitulo.getNroActa());
		} else {
			this.setNroActa(null);
		}
		this.setNroLibroMatriz(unAlumnoTitulo.getNroLibroMatriz());
		
		
		// datos estab a cargar
		this.setEstabCiudad(e.getCiudad());
		this.setEstabProvincia(e.getProvincia());
		this.setEstabNombre(e.getNombreEstab());
		this.setEstabUbicadoEn(e.getDireccion());
		this.setEstabCue(e.getCueNro());
	}

	public void inutilizar(EstadoOferta unEstado) {
		this.setFechaRuta(null);
		this.setNroSerie(null);
		this.setEstado(unEstado);
		this.setFechaUltimoEstado(new Date());
	}

	public String dameTuInfo() {
		return this.estabNombre.toUpperCase() + " C.U.E. Nº " + this.estabCue + " ubicado en "
				+ this.estabUbicadoEn.toUpperCase().replaceAll("Â", "") + " de la ciudad de "
				+ this.estabCiudad.toUpperCase() + " Provincia de " + this.estabProvincia.toUpperCase();
	}

	public String cargarPromedioFormateado() {
		String promedioFormateado = "";
		if (this.promedio == null) {
			return promedioFormateado;
		}
		try {
			Float.valueOf(this.promedio);
			if (this.promedio.indexOf(".") != -1) {
				if (this.promedio.substring(this.promedio.indexOf(".") + 1).length() == 1) {
					promedioFormateado = this.promedio + "0";

				}
			} else {
				if (promedio.indexOf(",") == -1) {
					promedioFormateado = this.promedio + ".00";
				}
			}
			return promedioFormateado;
		} catch (Exception e) {
			// queda igual la nota
			return promedioFormateado;
		}
	}

	public String promedioEnPalabras() {
		String retorno = this.getPromedio();
		try {
			// convierto el valor a float y lo multiplico por 100
			String[] valores = retorno.split(".");

			Integer entera = 0;
			Integer fraccional = 0;
			if (valores.length > 0) {
				entera = Integer.valueOf(valores[0]);
			}
			if (valores.length > 1) {
				if (valores[1].length() == 1) {
					fraccional = Integer.valueOf(valores[1]) * 10;
				} else {
					fraccional = Integer.valueOf(valores[1]);
				}
			}
			retorno = String.valueOf(entera);
			if (fraccional > 0) {
				retorno = retorno + ",";
				if (fraccional < 10) {
					retorno = retorno + "0";
				}
				retorno = retorno + String.valueOf(fraccional);
			}
			;
			retorno = retorno + "(";

			switch (entera) {
			case 0:
				retorno = retorno + "cero";
				break;
			case 1:
				retorno = retorno + "uno";
				break;
			case 2:
				retorno = retorno + "dos";
				break;
			case 3:
				retorno = retorno + "tres";
				break;
			case 4:
				retorno = retorno + "cuatro";
				break;
			case 5:
				retorno = retorno + "cinco";
				break;
			case 6:
				retorno = retorno + "seis";
				break;
			case 7:
				retorno = retorno + "siete";
				break;
			case 8:
				retorno = retorno + "ocho";
				break;
			case 9:
				retorno = retorno + "nueve";
				break;
			case 10:
				retorno = retorno + "diez";
				break;
			default:
				break;
			}
			if (fraccional > 0) {
				retorno = retorno + " con " + String.valueOf(fraccional) + "/100";
			}
			;
			retorno = retorno + ")";

		} catch (Exception e) {

		}
		return retorno;
	}

	public String observacionesTitulo() {
		if (this.observaciones != null && !"".equals(this.observaciones)) {
			return "Observaciones: " + this.observaciones;
		} else {
			return "Observaciones: -----------------------------------"
					+ "-----------------------------------------------------------";
		}
	}

	public String getNroInscripcion() {
		String retorno;
		if (this.numeroRfifd != null && !"".equals(this.numeroRfifd)) {
			retorno = this.numeroRfifd.toUpperCase();
		} else {
			retorno = "---------------------------------";
		}
		;
		return retorno;
	}

	public String validezNacional() {
		String retorno;
		if (this.validezNacional != null && !"".equals(this.validezNacional)) {
			retorno = this.validezNacional.toUpperCase();
		} else {
			retorno = "---------------------------------";
		}
		;
		return retorno;
	}

	public String fechaDeEgreso() {
		Calendar calendario = Calendar.getInstance();
		String retorno = "-----";
		if (this.fechaEgreso != null) {
			calendario.setTime(this.fechaEgreso);
			if (calendario.get(Calendar.DAY_OF_MONTH) >= 10) {
				retorno = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
			} else {
				retorno = "0" + String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
			}
			;
			retorno = retorno + " de " + this.getMesEnPalabras(calendario.get(Calendar.MONTH) + 1) + " de "
					+ calendario.get(Calendar.YEAR);
		}

		return retorno;
	}

	public String matrizActaFolio() {
		String retorno = "Libro Matriz Nº ";
		if (this.nroLibroMatriz != null) {
			retorno = retorno + this.nroLibroMatriz;
		} else {
			retorno = retorno + "--";
		}
		retorno = retorno + " Acta Nº ";
		if (this.nroActa != null) {
			retorno = retorno + this.nroActa;
		} else {
			retorno = retorno + "--";
		}
		retorno = retorno + " Folio Nº ";
		if (this.nroFolio != null) {
			retorno = retorno + this.nroFolio;
		} else {
			retorno = retorno + "--";
		}
		return retorno;
	}

	public String fechaEnvio(String diaEnPalabras) {
		Calendar calendario = Calendar.getInstance();
		if (this.fechaEnvio != null) {
			calendario.setTime(this.fechaEnvio);
			if (calendario.get(Calendar.DAY_OF_MONTH) >= 10) {
				diaEnPalabras = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
			} else {
				diaEnPalabras = "0" + String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
			}
			;
			diaEnPalabras = diaEnPalabras + " del mes de " + this.getMesEnPalabras(calendario.get(Calendar.MONTH) + 1)
					+ " del año " + calendario.get(Calendar.YEAR) + ".";
		}
		return diaEnPalabras;
	}

	public String getMesEnPalabras(int mesP) {
		String mes = "ENERO";
		switch (mesP) {
		case 1:
			mes = "ENERO";
			break;
		case 2:
			mes = "FEBRERO";
			break;
		case 3:
			mes = "MARZO";
			break;
		case 4:
			mes = "ABRIL";
			break;
		case 5:
			mes = "MAYO";
			break;
		case 6:
			mes = "JUNIO";
			break;
		case 7:
			mes = "JULIO";
			break;
		case 8:
			mes = "AGOSTO";
			break;
		case 9:
			mes = "SEPTIEMBRE";
			break;
		case 10:
			mes = "OCTUBRE";
			break;
		case 11:
			mes = "NOVIEMBRE";
			break;
		default:
			mes = "DICIEMBRE";
			break;
		}
		return mes;
	}

	public String dondeSeOtorgaTitulo() {
		return "Otorgado en la ciudad de " + this.estabCiudad.toUpperCase() + " de la provincia de "
				+ this.estabProvincia.toUpperCase() + ", República Argentina, el día " + this.fechaEnvio("-----");
	}

	public boolean estaEnEstadoModificable() {
		return this.estado.enEstadoModificable();
	}

}
