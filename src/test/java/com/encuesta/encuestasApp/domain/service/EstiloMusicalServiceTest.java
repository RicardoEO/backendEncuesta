package com.encuesta.encuestasApp.domain.service;

import com.encuesta.encuestasApp.domain.dto.EstiloMusicalDTO;
import com.encuesta.encuestasApp.domain.repository.EstiloMusicalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class EstiloMusicalServiceTest {

    @Mock
    private EstiloMusicalRepository estiloMusicalRepository;

    @InjectMocks
    private EstiloMusicalService estiloMusicalService;

    EstiloMusicalDTO estiloMusicalDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAll() {
        when(estiloMusicalRepository.getAll()).thenReturn(Arrays.asList(estiloMusicalDTO));
        assertNotNull(estiloMusicalService.getAll());
    }
}