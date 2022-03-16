package com.encuesta.encuestasApp.domain.dto;

public class EncuestaDTO {
    private Integer id;
    private Integer idEstiloMusical;
    private String correo;
    private EstiloMusicalDTO estiloMusical;

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

    public EstiloMusicalDTO getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(EstiloMusicalDTO estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
}
