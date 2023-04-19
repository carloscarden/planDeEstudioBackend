package com.dgcye.planDeEstudio.repoEdu.ofertaEducativa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.Materia;


public interface MateriaRepository extends JpaRepository<Materia ,Integer>{

	List<Materia> findByOfertaEducativaId(Integer id);

	@Query(value="delete from abc.Materia where idOfertaEducativa = :idOfertaEducativa",
			nativeQuery=true)
	void borrarPorIdOfertaEducativa(@Param("idOfertaEducativa") Integer idOfertaEducativa);


	@Query("SELECT m FROM Materia m "
			+ " WHERE m.ofertaEducativa.id= :idOfertaCopia AND "
			+ " m.materiaDenominacion.id= :idMateriaDenominacion AND "
			+ " m.seccion.id= :idSeccion AND "
			+ " m.orden = :idOrden")
	Materia readByOrdenYSeccion(
			@Param("idOfertaCopia") Integer idOfertaCopia, 
			@Param("idMateriaDenominacion") Integer idMateriaDenominacion , 
			@Param("idOrden") Integer idOrden, 
			@Param("idSeccion") Integer idSeccion);

	
	
	@Query("select count(*) from Materia as p"
			+ " where p.ofertaEducativa.id= :idOfertaEducativa and p.codigosChequeados = 0")
	Integer cantidadMateriasSinCheck(@Param("idOfertaEducativa") Integer idOfertaEducativa);
}
