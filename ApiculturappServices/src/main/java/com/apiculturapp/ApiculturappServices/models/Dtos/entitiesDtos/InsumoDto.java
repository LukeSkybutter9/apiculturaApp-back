package com.apiculturapp.ApiculturappServices.models.Dtos.entitiesDtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsumoDto {
    private Integer idInsumo;
    private String nombre;
    private Integer cantTotal;
    private Integer cantDisponible;
    private String tipoInsumo;
}
