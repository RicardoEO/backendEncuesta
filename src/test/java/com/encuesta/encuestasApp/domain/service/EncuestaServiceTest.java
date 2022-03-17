package com.encuesta.encuestasApp.domain.service;

import com.encuesta.encuestasApp.domain.repository.EncuestaRepository;
import com.encuesta.encuestasApp.projections.Tabla;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class EncuestaServiceTest {

    @Mock
    private EncuestaRepository encuestaRepository;

    @InjectMocks
    private EncuestaService encuestaService;

    private Tabla tabla;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAll() {
        when(encuestaRepository.getAll()).thenReturn(Arrays.asList(tabla));
        assertNotNull(encuestaService.getAll());
    }
}