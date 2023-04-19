package com.dgcye.planDeEstudio.webApis;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dgcye.planDeEstudio.dtos.perfileria.OpcionPerfilDTO;
import com.dgcye.planDeEstudio.exceptions.EntityNotFoundException;
import com.dgcye.planDeEstudio.services.PerfileriaService;

@RestController
@RequestMapping("/api")
public class PerfileriaController {

	@Autowired
	private PerfileriaService perfileriaService;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@GetMapping("/recuperarOpcionesPerfil/{documento}")
	public ResponseEntity<Map<String,List<OpcionPerfilDTO>>> recuperarOpcionesPerfil(
			RestTemplate restTemplate, @PathVariable String documento)	throws EntityNotFoundException{
	
		Map<String,List<OpcionPerfilDTO>> perfilesYOpciones =
				perfileriaService.recuperarOpcionesPerfil(documento, restTemplate);
		
		return perfilesYOpciones.isEmpty()
				? ResponseEntity.noContent().build()
				: ResponseEntity.ok().body(perfilesYOpciones);
	}
	
	
	
	
	
}
