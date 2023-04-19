package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaXTipoOrg;
import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaXTipoOrgId;


public interface OfertaEducativaXTipoOrgRepository extends JpaRepository<OfertaXTipoOrg, OfertaXTipoOrgId>{

	
	@Query(value="delete from abc.OfertaXTipoOrg where idOfertaEducativa = :idOfertaEducativa",
			nativeQuery=true)
	void borrarPorIdOfertaEducativa(@Param("idOfertaEducativa") Integer idOfertaEducativa);
	
	@Query("SELECT o from OfertaXTipoOrg o"
			+ " where o.ofertaXTipoOrgId.idOfertaEducativa = :idOfertaEducativa")
	List<OfertaXTipoOrg> 
	    buscarPorIdOfertaEducativa(@Param("idOfertaEducativa") Integer idOfertaEducativa);

}
