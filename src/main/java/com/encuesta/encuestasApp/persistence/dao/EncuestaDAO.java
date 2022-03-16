package com.encuesta.encuestasApp.persistence.dao;

import com.encuesta.encuestasApp.persistence.entity.Encuesta;
import com.encuesta.encuestasApp.projections.CountByEstilos;
import com.encuesta.encuestasApp.projections.Tabla;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EncuestaDAO extends CrudRepository<Encuesta, Integer> {
    @Query(value = "SELECT em.NOMBRE as nombre, COUNT(ENC.ID) as cantidad FROM ENCUESTA AS ENC" +
            " INNER JOIN ESTILOMUSICAL as em ON ENC.ESTILOMUSICAL = em.ID" +
            " GROUP BY ESTILOMUSICAL", nativeQuery = true)
    List<CountByEstilos> countByEstilos();

    @Query(value = "SELECT em.NOMBRE as estilo, enc.correo as correo FROM ENCUESTA AS ENC" +
            " INNER JOIN ESTILOMUSICAL as em ON enc.ESTILOMUSICAL = em.ID", nativeQuery = true)
    List<Tabla> getAllWithName();

    Optional<Encuesta> findByCorreo(String correo);
}
