package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.MateriaOfertaMateriaIngreso;
import com.dgcye.planDeEstudio.modelEdu.ofertaEducativa.MateriaOfertaMateriaIngresoID;


public interface MateriaOfertaMateriaIngresoRepository 
			extends JpaRepository<MateriaOfertaMateriaIngreso, MateriaOfertaMateriaIngresoID >{

	
	@Query("SELECT m FROM MateriaOfertaMateriaIngreso m "
			+ " WHERE m.materiaIngresoId.idMateria = :materiaId" 
			)
	List<MateriaOfertaMateriaIngreso> buscarPorMateriaId(@Param("materiaId") Integer materiaId);

	
	
	@Query(value="delete from abc.MateriaOfertaMateriaIngreso where idMateria in "
			+ " (select id from Materia where idOfertaEducativa = :idOfertaEducativa)",
			nativeQuery=true)
	void borrarMIAsociadaAMateriasDeIdOfertaEducativa(
			@Param("idOfertaEducativa")Integer idOfertaEducativa);



	@Query("SELECT m FROM MateriaOfertaMateriaIngreso m "
			+ " WHERE m.materiaIngresoId.idMateria = :idMateria"
			+ " AND m.materiaIngresoId.idMateriaIngreso = :idMateriaIngreso" 
			)
	MateriaOfertaMateriaIngreso buscoPorMateriaIdYMateriaIngresoId(
	    		 				  @Param("idMateria")Integer idMateria,
	    		 				  @Param("idMateriaIngreso")Integer idMateriaIngreso);
}
