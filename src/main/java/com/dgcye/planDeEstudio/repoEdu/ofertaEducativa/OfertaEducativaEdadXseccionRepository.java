package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativaEdadXSeccion;
import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativaEdadXseccionId;


public interface OfertaEducativaEdadXseccionRepository extends JpaRepository<OfertaEducativaEdadXSeccion, OfertaEducativaEdadXseccionId>{
	@Query("SELECT o FROM OfertaEducativaEdadXSeccion o "
			+ " WHERE o.id.ofertaEducativaId = :idOfertaEducativa " 
			)
	List<OfertaEducativaEdadXSeccion> 
	   buscarPorIdOfertaEducativa(@Param("idOfertaEducativa") Integer idOfertaEducativa);

	
	@Query(value= "delete from abc.OFERTAEDUCATIVAEDADSECCION where idOfertaEducativa = :idOfertaEducativa",
			nativeQuery = true)
	void borrarPorIdOfertaEducativa(@Param("idOfertaEducativa") Integer idOfertaEducativa);
	

}
