package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.TipoOrganizacion;


public interface TipoOrganizacionRepository extends JpaRepository<TipoOrganizacion, Integer>{
	
	@Query("SELECT t FROM TipoOrganizacion t WHERE "
			+ "t.idEnsenanzaIngreso= :idEnsenanza AND t.establecimientoEducativo = 'E'  ")
	List<TipoOrganizacion> buscarPorIdEnsenanza(@Param("idEnsenanza") Integer idEnsenanza);

	
	@Query("SELECT t FROM TipoOrganizacion t WHERE t.idEnsenanzaIngreso is not null"
			+ " and t.establecimientoEducativo = 'E' order by t.codigo")
	List<TipoOrganizacion> buscarPorIdIngresoIsNull();

}
