package com.encuesta.encuestasApp.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "encuesta")
public class Encuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "estilomusical")
    private Integer idEstiloMusical;

    @Column(unique = true)
    private String correo;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "estilomusical", insertable = false, updatable = false)
    private EstiloMusical estiloMusical;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdEstiloMusical() {
        return idEstiloMusical;
    }

    public void setIdEstiloMusical(Integer idEstiloMusical) {
        this.idEstiloMusical = idEstiloMusical;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public EstiloMusical getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(EstiloMusical estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
}
