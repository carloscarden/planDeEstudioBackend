package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.Seccion;


public interface SeccionRepository extends JpaRepository<Seccion, Integer>{

	
	@Query("select distinct(m.seccion)  "
			+ " from Materia as m "
			+ " where m.ofertaEducativa.id=:idOfertaEducativa")
	List<Seccion> listSecciones(Integer idOfertaEducativa);
	
	

}
