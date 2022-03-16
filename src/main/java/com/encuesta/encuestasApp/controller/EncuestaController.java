package com.encuesta.encuestasApp.controller;

import com.encuesta.encuestasApp.domain.dto.EstiloMusicalDTO;
import com.encuesta.encuestasApp.domain.service.EncuestaService;
import com.encuesta.encuestasApp.persistence.entity.Encuesta;
import com.encuesta.encuestasApp.projections.CountByEstilos;
import com.encuesta.encuestasApp.projections.Tabla;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/encuesta")
public class EncuestaController {

    @Autowired
    private EncuestaService encuestaService;

    @PostMapping("/save")
    public ResponseEntity<Encuesta> save(@RequestBody Encuesta encuesta) {
        return new ResponseEntity<>(encuestaService.guardarEncuesta(encuesta), HttpStatus.CREATED);
    }

    @GetMapping("/count")
    public ResponseEntity<List<CountByEstilos>> list() {
        return new ResponseEntity<>(encuestaService.getCountByEstilos(), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Tabla>> all() {
        return new ResponseEntity<>(encuestaService.getAll(), HttpStatus.OK);
    }

}
