package com.dgcye.planDeEstudio.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dgcye.planDeEstudio.dtos.perfileria.OpcionPerfilDTO;
import com.dgcye.planDeEstudio.dtos.perfileria.OpcionPerfilRamaDTO;
import com.dgcye.planDeEstudio.modelEdu.establecimiento.Localizacion;
import com.dgcye.planDeEstudio.modelEdu.perfileria.Perfil;
import com.dgcye.planDeEstudio.modelEdu.perfileria.RamaTiposPerfilDescripcion;
import com.dgcye.planDeEstudio.modelEdu.perfileria.UsuarioRest;
import com.dgcye.planDeEstudio.repoEdu.VPerfilRepository;
import com.dgcye.planDeEstudio.repoEdu.establecimiento.LocalizacionRepository;


@Service
public class PerfileriaService {

	@Autowired
	private VPerfilRepository vPerfilRepository;

	@Autowired
	private LocalizacionRepository localizacionRepository;

	private static final String SERVICIO_REST_PERSONA = 
			"http://servicios2.abc.gov.ar/servicios/intranet/rest/user/?documento=";

	public Map<String, List<OpcionPerfilDTO>> recuperarOpcionesPerfil(
			String documento, RestTemplate restTemplate) {
		Map<String, List<OpcionPerfilDTO>> perfilesYOpciones = 
				new HashMap<String, List<OpcionPerfilDTO>>();

		llenarPerfilesDeVPerfil(perfilesYOpciones, documento);
		llenarPerfilesRest(perfilesYOpciones, documento, restTemplate);
		return perfilesYOpciones;
	}

	private void llenarPerfilesDeVPerfil(
			Map<String, List<OpcionPerfilDTO>> perfilesYOpciones, String documento) {
		List<Object[]> perfiles = vPerfilRepository.recuperarOpcionesPerfil(documento);
		for (Object[] perfil : perfiles) {
			agregarNuevaOpcionPerfil(perfil, perfilesYOpciones);
		}

	}

	private void agregarNuevaOpcionPerfil(
			Object[] perfil, Map<String, List<OpcionPerfilDTO>> perfilesYOpciones) {
		
		RamaTiposPerfilDescripcion r = 
				Enum.valueOf(RamaTiposPerfilDescripcion.class, ((String) perfil[1]).toUpperCase());
		String tipoPerfil =r.getDescripcion() ;
		List<OpcionPerfilDTO> opcionesPerfil;
		OpcionPerfilRamaDTO opcionRama;
		if (perfilesYOpciones.containsKey(tipoPerfil)) {
			if (!tipoPerfil.equals("Super administrador")) {

				opcionesPerfil = perfilesYOpciones.get(tipoPerfil);
				opcionRama = new OpcionPerfilRamaDTO();
				opcionRama.llenarOpcionRama(perfil);
				opcionesPerfil.add(opcionRama);
			}

		} else {
			opcionesPerfil = new ArrayList<OpcionPerfilDTO>();
			if (tipoPerfil.equals("Super administrador")) {
				perfilesYOpciones.put(tipoPerfil, opcionesPerfil);
			} else {
				opcionRama = new OpcionPerfilRamaDTO();
				opcionRama.llenarOpcionRama(perfil);
				opcionesPerfil.add(opcionRama);
				perfilesYOpciones.put(tipoPerfil, opcionesPerfil);
			}

		}

	}

	private void llenarPerfilesRest(Map<String, List<OpcionPerfilDTO>> perfilesYOpciones, 
			String documento, RestTemplate restTemplate) {

		UsuarioRest usuarioST = 
				restTemplate.getForObject(SERVICIO_REST_PERSONA + documento, UsuarioRest.class);

		List<Perfil> perfilesST = usuarioST.buscarPerfilesRest();
		for (Perfil p : perfilesST) {
			agregarPerfilEstab(p, perfilesYOpciones);
		}

	}

	private void agregarPerfilEstab(Perfil p, Map<String, List<OpcionPerfilDTO>> perfilesYOpciones) {
		String nombrePerfil = p.getNombrePerfil();
		List<OpcionPerfilDTO> opcionesPerfil;
		if (perfilesYOpciones.containsKey(nombrePerfil)) {

			opcionesPerfil = perfilesYOpciones.get(nombrePerfil);
			llenarOpcionEstab(opcionesPerfil, p, nombrePerfil);
		} else {
			opcionesPerfil = new ArrayList<OpcionPerfilDTO>();
			llenarOpcionEstab(opcionesPerfil, p, nombrePerfil);
			perfilesYOpciones.put(nombrePerfil, opcionesPerfil);

		}

	}

	private void llenarOpcionEstab(List<OpcionPerfilDTO> opcionesPerfil, Perfil p, String nombrePerfil) {
		List<String> servicios = p.getServicios();
		List<Localizacion> estabs;
		OpcionPerfilDTO opcionEstab;
		for (String claveEstab : servicios) {
			estabs = localizacionRepository.findByClaveEstab(claveEstab);
			if (estabs.size() > 0) {
				opcionEstab = new OpcionPerfilDTO();
				opcionEstab.setId((long) estabs.get(0).getIdSer());
				opcionEstab.setDescripcion(nombrePerfil + claveEstab);
				opcionesPerfil.add(opcionEstab);
			}
		}

	}

}
