package com.apiculturapp.ApiculturappServices.models.Dtos.entitiesDtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
public class ExtraccionDto {
    private Integer idExtraccion;
    private Integer idAlza;
    private Integer idPanel;
    private LocalDate fecha;
    private LocalTime hora;
    private Integer idLoteenvasado;
    private Integer cantCera;
}
