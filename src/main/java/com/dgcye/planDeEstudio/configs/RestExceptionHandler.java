package com.dgcye.planDeEstudio.configs;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dgcye.planDeEstudio.exceptions.ValidationException;





/**
 * 
 *         https://www.toptal.com/java/spring-boot-rest-api-error-handling
 * 
 * 
 * It provides mapping of several exceptions to the same method, to be handled together.
 * 
 *  
 * we’ll be able to define a central point for treating exceptions and wrapping them up 
 * in an ApiError object with better organization than the default Spring Boot error handling 
 * mechanism
 * 
 * 
 * We’ll be extending ResponseEntityExceptionHandler as it already provides
 *  some basic handling of Spring MVC exceptions, 
 *  so we’ll be adding handlers for new exceptions while improving the existing ones.
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    
	/**
	 * No es buen nombre, es para manejar no solamente la expiracion del Jwt sino
	 * la gran mayoría de las excepciones que el servidor entiende el tipo del contenido del
	 * request y la sintaxis del request es correcta, 
	 * pero no fue posible procesar las instrucciones contenidas.
	 * 
	 * @return ResponseEntity<Object>
	 */
	@ExceptionHandler(ValidationException.class)
	protected ResponseEntity<Object> handleExpiredJwt(ValidationException e) {
		String error="Fallo la validacion";
		ApiError apiErr = new ApiError(HttpStatus.UNPROCESSABLE_ENTITY,error,e,e.getErrores());
		return new ResponseEntity<Object>(apiErr,apiErr.getStatus());
	}

}