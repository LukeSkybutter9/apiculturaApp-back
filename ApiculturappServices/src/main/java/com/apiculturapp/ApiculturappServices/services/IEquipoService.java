package com.apiculturapp.ApiculturappServices.services;

import com.apiculturapp.ApiculturappServices.models.entities.Equipo;

import java.util.List;
import java.util.Optional;

public interface IEquipoService {
    Equipo crearEquipo(Equipo equipo);
    Optional<Equipo> obtenerEquipoPorId(Integer id);
    List<Equipo> obtenerTodosLosEquipos();
    void eliminarEquipo(Integer id);
    Equipo actualizarEquipo(Integer id, Equipo detallesEquipo);

}
