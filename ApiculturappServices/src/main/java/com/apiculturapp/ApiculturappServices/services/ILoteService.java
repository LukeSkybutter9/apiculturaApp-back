package com.apiculturapp.ApiculturappServices.services;

import com.apiculturapp.ApiculturappServices.models.entities.Extraccion;
import com.apiculturapp.ApiculturappServices.models.entities.Lote;

import java.util.List;
import java.util.Optional;

public interface ILoteService {
    Lote crearLote(Lote lote);
    Optional<Lote> obtenerLotePorId(Integer id);
    List<Lote> obtenerTodosLosLotes();
}
