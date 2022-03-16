package com.encuesta.encuestasApp.persistence.mapper;

import com.encuesta.encuestasApp.domain.dto.EstiloMusicalDTO;
import com.encuesta.encuestasApp.persistence.entity.EstiloMusical;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


@Mapper(componentModel = "spring")
public interface EstiloMusicalMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombreEstilo", target = "nombreEstilo")
    })
    List<EstiloMusicalDTO> toEstiloMusicalDTO(List<EstiloMusical> estiloMusical);

    @InheritInverseConfiguration
    @Mapping(target = "encuestas", ignore = true)
    EstiloMusical toEstiloMusical(EstiloMusicalDTO estiloMusicalDTO);
}
