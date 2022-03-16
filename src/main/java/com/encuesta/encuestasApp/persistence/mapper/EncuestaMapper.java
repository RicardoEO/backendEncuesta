package com.encuesta.encuestasApp.persistence.mapper;

import com.encuesta.encuestasApp.domain.dto.EncuestaDTO;
import com.encuesta.encuestasApp.domain.dto.EstiloMusicalDTO;
import com.encuesta.encuestasApp.persistence.entity.Encuesta;
import com.encuesta.encuestasApp.persistence.entity.EstiloMusical;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {EstiloMusicalMapper.class})
public interface EncuestaMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "idEstiloMusical", target = "idEstiloMusical"),
            @Mapping(source = "correo", target = "correo"),
            @Mapping(source = "estiloMusical", target = "estiloMusical")
    })
    EncuestaDTO toEncuestaDTO(Encuesta encuesta);
}
