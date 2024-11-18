package com.apiculturapp.ApiculturappServices.services;

import com.apiculturapp.ApiculturappServices.models.entities.Extraccion;

import java.util.List;
import java.util.Optional;

public interface IExtraccionService {
    Extraccion crearExtraccion(Extraccion extraccion);
    Optional<Extraccion> obtenerExtraccionPorId(Integer id);
    List<Extraccion> obtenerTodasLasExtracciones();
}
