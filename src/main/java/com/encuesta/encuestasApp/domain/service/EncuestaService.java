package com.encuesta.encuestasApp.domain.service;

import com.encuesta.encuestasApp.domain.repository.EncuestaRepository;
import com.encuesta.encuestasApp.persistence.entity.Encuesta;
import com.encuesta.encuestasApp.projections.CountByEstilos;
import com.encuesta.encuestasApp.projections.Tabla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncuestaService {

    @Autowired
    private EncuestaRepository encuestaRepository;

    public Encuesta guardarEncuesta(Encuesta encuesta) {
        return encuestaRepository.guardarEncuesta(encuesta);
    }

    public List<CountByEstilos> getCountByEstilos() {
        return encuestaRepository.getCountByEstilos();
    }

    public List<Tabla> getAll() {
        return encuestaRepository.getAll();
    }

}
