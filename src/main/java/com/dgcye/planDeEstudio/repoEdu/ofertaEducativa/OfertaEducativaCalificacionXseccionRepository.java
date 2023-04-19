package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativaCalificacionXseccion;


public interface OfertaEducativaCalificacionXseccionRepository 
     extends JpaRepository<OfertaEducativaCalificacionXseccion, Long>{
	
	long countByCalificacionId(Long idCalificacion);	
	
	List<OfertaEducativaCalificacionXseccion> findByIdOfertaEducativa(Integer idOfertaEducativa);

	@Query(value="delete from abc.CALIFICACION_CALIFICACION_X_SECCION_OFERTA "
			+ "  where idOfertaEducativa = :idOfertaEducativa",
			nativeQuery=true)
	void borrarPorIdOfertaEducativa(@Param("idOfertaEducativa") Integer idOfertaEducativa);

}
