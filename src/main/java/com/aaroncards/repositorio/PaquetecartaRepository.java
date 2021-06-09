package com.aaroncards.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aaroncards.entidad.Paquetecarta;

public interface PaquetecartaRepository extends JpaRepository<Paquetecarta, Integer> {

	@Query("select p from Paquetecarta p where nompaquecart like:fil")
	public abstract List<Paquetecarta> listaPaquetecartaPorNombreLike(@Param("fil") String filtro);
	
}
