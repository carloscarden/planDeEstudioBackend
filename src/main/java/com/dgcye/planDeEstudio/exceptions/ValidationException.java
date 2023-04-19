package com.dgcye.planDeEstudio.exceptions;

import java.util.List;

/**
 * Excepcion customizada que se le agregan todos los errores que tuvo el usuario
 * 
 */
public class ValidationException extends Exception{

	private static final long serialVersionUID = 1L;
	List<ValidationError> errores;

	public ValidationException(List<ValidationError> errores) {
		this.errores=errores;
	}
	
	/**
	 * Lista de las equivocaciones que tuvo el usuario
	 * @return
	 */
	public List<ValidationError> getErrores() {
		return errores;
	}
	
	/**
	 * @return
	 */
	@Override
	public String getMessage() {
		return errores.toString();
	}

	public void setErrores(List<ValidationError> errores) {
		this.errores = errores;
	}
	
}
