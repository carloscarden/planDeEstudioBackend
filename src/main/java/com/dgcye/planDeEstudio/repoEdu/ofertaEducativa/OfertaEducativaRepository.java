package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.OfertaEducativa;


public interface OfertaEducativaRepository extends JpaRepository<OfertaEducativa,Integer>{

	@Query(value="SELECT o.titulo, o.orientacion  "
			+ " FROM ABC.OFERTAEDUCATIVA o "
			+ " WHERE o.ID = :idOfertaEducativa",
			nativeQuery=true)
	List<Object[]> verDescripcionCompletaDeTitulo(
			@Param(value = "idOfertaEducativa") Integer idOfertaEducativa);
	
	
	@Query("SELECT oe.idCursoGrupoNombre FROM OfertaEducativa oe where oe.id = :idOfertaEducativa")
	Integer encontrarIdCursoGrupoNombre(@Param(value="idOfertaEducativa") Integer idOfertaEducativa);

	
	@Query(value = 
			" SELECT o.id, o.titulo, o.orientacion, o.titula, o.idnormaaprobacionden, odg.descripcion "
			+ " FROM ABC.OfertaEducativa o "
			+ " INNER JOIN "
			+ "    abc.OFERTADENOMINACIONESGENERALES odg on o.IDNORMAAPROBACIONDEN = odg.ID "
			+ " WHERE o.id IN (:ids)", 
			nativeQuery=true)     
	List<Object[]> verDescripcionYTitula(@Param("ids") List<Integer> id);		
	
	
	OfertaEducativa findById(Integer idOfertaEducativa);
	
	long countByIdCursoGrupoNombre(Integer idCursoGrupoNombre);	
}
