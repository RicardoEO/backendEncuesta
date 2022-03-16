package com.encuesta.encuestasApp.domain.service;

import com.encuesta.encuestasApp.domain.dto.EstiloMusicalDTO;
import com.encuesta.encuestasApp.domain.repository.EstiloMusicalRepository;
import com.encuesta.encuestasApp.persistence.entity.EstiloMusical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstiloMusicalService {

    @Autowired
    private EstiloMusicalRepository estiloMusicalRepository;

    public List<EstiloMusicalDTO> getAll() {
        return estiloMusicalRepository.getAll();
    }

}
