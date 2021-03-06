package com.encuesta.encuestasApp.domain.repository;

import com.encuesta.encuestasApp.persistence.dao.EncuestaDAO;
import com.encuesta.encuestasApp.persistence.entity.Encuesta;
import com.encuesta.encuestasApp.projections.CountByEstilos;
import com.encuesta.encuestasApp.projections.Tabla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EncuestaRepository {

    @Autowired
    private EncuestaDAO encuestaDAO;

    public Encuesta guardarEncuesta(Encuesta encuesta) {
        return encuestaDAO.save(encuesta);
    }

    public Optional<Encuesta> getByCorreo(String correo) {
        Optional<Encuesta> encuesta = encuestaDAO.findByCorreo(correo);
        return encuesta;
    }

    public List<CountByEstilos> getCountByEstilos() {
        return encuestaDAO.countByEstilos();
    }

    public List<Tabla> getAll() {
        return (List<Tabla>) encuestaDAO.getAllWithName();
    }
}
