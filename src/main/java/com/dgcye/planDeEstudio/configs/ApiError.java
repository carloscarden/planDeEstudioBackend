package com.dgcye.planDeEstudio.configs;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.dgcye.planDeEstudio.exceptions.ValidationError;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * hold relevant information about errors that happen during REST calls
 *
 */
public class ApiError {

	private HttpStatus status;
	@JsonFormat(pattern="dd-MM-yyyy HH:mm")
	private Date timestamp;
	private String mensaje;
	private String mensajeDebug;
	private List<ValidationError> subErrores;
	
	ApiError(HttpStatus status, Throwable e) {
		this.timestamp=new Date();
		this.status = status;
		this.mensaje = "Unexpected error";
		this.setMensajeDebug(e.getLocalizedMessage());
	}
	 
	ApiError(HttpStatus status, String mensaje, Throwable e) {
		this.timestamp=new Date();
		this.status = status;
		this.mensaje = mensaje;
		this.setMensajeDebug(e.getLocalizedMessage());
	}
	
	ApiError(HttpStatus status, String mensaje, Throwable e, List<ValidationError> subErrores) {
		this.timestamp=new Date();
		this.status = status;
		this.mensaje = mensaje;
		this.setMensajeDebug(e.getLocalizedMessage());
		this.subErrores=subErrores;
	}

	/**
	 * retorna the operation call status. 
	 * It will be anything from 4xx to signalize client errors or 5xx to mean server errors.
	 * @return HttpStatus
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * retorna the date-time instance of when the error happened
	 * @return Date
	 */
	public Date getTimestamp() {
		return timestamp;
	}


	/**
	 * retorna a user-friendly message about the error
	 * @return String
	 */
	public String getMensaje() {
		return mensaje;
	}
	
	/**
	 * retorna a system message describing the error in more detail
	 * @return
	 */
	public String getMensajeDebug() {
		return mensajeDebug;
	}



	/**
	 *  retorna an array of sub-errors that happened. 
	 *  This is used for representing multiple errors in a single call
	 * @return
	 */
	public List<ValidationError> getSubErrors() {
		return subErrores;
	}

	

	public void setMensajeDebug(String mensajeDebug) {
		this.mensajeDebug = mensajeDebug;
	}
	
}
