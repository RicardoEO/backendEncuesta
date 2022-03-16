package com.encuesta.encuestasApp.controller;

import com.encuesta.encuestasApp.domain.dto.EstiloMusicalDTO;
import com.encuesta.encuestasApp.domain.service.EstiloMusicalService;
import com.encuesta.encuestasApp.persistence.entity.EstiloMusical;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/estilos")
public class EstiloMusicalController {

    @Autowired
    private EstiloMusicalService estiloMusicalService;

    @GetMapping("/all")
    public ResponseEntity<List<EstiloMusicalDTO>> getAll() {
        return new ResponseEntity<>(estiloMusicalService.getAll(), HttpStatus.OK);
    }

}
