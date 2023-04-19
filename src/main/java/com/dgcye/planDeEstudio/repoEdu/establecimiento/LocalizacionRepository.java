package com.dgcye.planDeEstudio.repoEdu.establecimiento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dgcye.planDeEstudio.modelEdu.establecimiento.Localizacion;


public interface LocalizacionRepository extends JpaRepository<Localizacion, Integer>{
	
	List<Localizacion> findByClaveEstab(String claveEstab);
	
	
	@Query("SELECT aeo.idSer FROM Localizacion aeo where aeo.claveEstab = :claveEstab")
	Integer encontrarSuIdSerPorClaveEstab(@Param(value="claveEstab") String claveEstab);


	Localizacion findByIdEstab(Integer idLocalizacion);


	Localizacion findByIdSer(Integer idSer);
	
	

}
