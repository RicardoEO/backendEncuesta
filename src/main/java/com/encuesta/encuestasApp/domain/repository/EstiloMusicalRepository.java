package com.encuesta.encuestasApp.domain.repository;

import com.encuesta.encuestasApp.domain.dto.EstiloMusicalDTO;
import com.encuesta.encuestasApp.persistence.dao.EstiloMusicalDAO;
import com.encuesta.encuestasApp.persistence.entity.EstiloMusical;
import com.encuesta.encuestasApp.persistence.mapper.EstiloMusicalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstiloMusicalRepository {

    @Autowired
    private EstiloMusicalDAO estiloMusicalDAO;

    @Autowired
    private EstiloMusicalMapper mapper;

    public List<EstiloMusicalDTO> getAll() {
        List<EstiloMusical> estilos = (List<EstiloMusical>) estiloMusicalDAO.findAll();
        return mapper.toEstiloMusicalDTO(estilos);
    }
}
