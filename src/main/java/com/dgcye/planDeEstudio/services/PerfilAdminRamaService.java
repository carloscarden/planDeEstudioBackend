package com.dgcye.planDeEstudio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgcye.planDeEstudio.modelEdu.Rama;
import com.dgcye.planDeEstudio.modelEdu.perfileria.VPermiso;
import com.dgcye.planDeEstudio.repoEdu.VPermisoRepository;
import com.dgcye.planDeEstudio.repoEdu.ofertaEducativa.RamaRepository;


@Service
public class PerfilAdminRamaService {

	@Autowired
	private RamaRepository ramaRepository;
	
	@Autowired
	private VPermisoRepository vPermisoRepository;
	
	public Rama retornarRamaElegida(Integer idRama) {
		return ramaRepository.findById(idRama);
	}

	public List<String> verPermisosRamaDelPerfil(Long idPerfil) {
		List<VPermiso> permisos= vPermisoRepository.findByVPermisoIdPerfilId(idPerfil);
		return permisos
				.stream()
				.map(p -> p.getVPermisoId().getCodigoOperacion())
				.collect(Collectors.toList());		
	}

}
