package com.dgcye.planDeEstudio.webApis;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgcye.planDeEstudio.dtos.ofertaEducativa.RamaDTO;
import com.dgcye.planDeEstudio.exceptions.EntityNotFoundException;
import com.dgcye.planDeEstudio.services.PerfilAdminRamaService;

@RestController
@RequestMapping("/api")
public class PerfilAdminRamaController {

	@Autowired
	private PerfilAdminRamaService adminRamaService;

	@GetMapping("/recuperarOpcionRamaElegida/{idRama}")
	public ResponseEntity<RamaDTO> recuperarOpcionRamaElegida(@PathVariable Integer idRama) 
			throws EntityNotFoundException{
		return Optional
				.ofNullable(adminRamaService.retornarRamaElegida(idRama))
				.map(rama -> ResponseEntity.ok().body(new RamaDTO(rama)))
				.orElseThrow(
						() ->
						new EntityNotFoundException(RamaDTO.class, "idRama", "Id rama no encontrado"));

	}
	
	@GetMapping("/verPermisosRamaDelPerfil/{idPerfil}")
	public ResponseEntity<List<String>> verPermisosRamaDelPerfil(@PathVariable Long idPerfil) 
			throws EntityNotFoundException{
		List<String> permisos = adminRamaService.verPermisosRamaDelPerfil(idPerfil);
		return permisos.isEmpty()
				? ResponseEntity.noContent().build()
				: ResponseEntity.ok().body(permisos);
	}
}
