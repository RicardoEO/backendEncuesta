package com.encuesta.encuestasApp.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estilomusical")
public class EstiloMusical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(name = "nombre")
    private String nombreEstilo;

    @OneToMany(mappedBy = "estiloMusical")
    private List<Encuesta> encuestas;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNombreEstilo() {
        return nombreEstilo;
    }

    public void setNombreEstilo(String nombreEstilo) {
        this.nombreEstilo = nombreEstilo;
    }

    public List<Encuesta> getEncuestas() {
        return encuestas;
    }

    public void setEncuestas(List<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }
}
