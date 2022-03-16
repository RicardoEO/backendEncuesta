package com.encuesta.encuestasApp.domain.service;

import com.encuesta.encuestasApp.domain.repository.EncuestaRepository;
import com.encuesta.encuestasApp.exceptions.EmailFoundException;
import com.encuesta.encuestasApp.persistence.entity.Encuesta;
import com.encuesta.encuestasApp.projections.CountByEstilos;
import com.encuesta.encuestasApp.projections.Tabla;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncuestaService {

    @Autowired
    private EncuestaRepository encuestaRepository;

    public Object guardarEncuesta(Encuesta encuesta) throws Exception {
        String correo = encuesta.getCorreo();
        Optional<Encuesta> existeCorreo = this.getByCorreo(correo);

        if(existeCorreo.isPresent()) {
            throw new EmailFoundException("El correo ya está registrado");
        }
        return encuestaRepository.guardarEncuesta(encuesta);
    }

    public Optional<Encuesta> getByCorreo(String correo) {
        return encuestaRepository.getByCorreo(correo);
    }

    public List<CountByEstilos> getCountByEstilos() {
        return encuestaRepository.getCountByEstilos();
    }

    public List<Tabla> getAll() {
        return encuestaRepository.getAll();
    }

}
