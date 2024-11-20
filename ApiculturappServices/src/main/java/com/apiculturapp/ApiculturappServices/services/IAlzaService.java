package com.apiculturapp.ApiculturappServices.services;
import com.apiculturapp.ApiculturappServices.models.entities.Alza;

import java.util.List;
import java.util.Optional;

public interface IAlzaService {
    Alza crearAlza(Alza alza);
    Optional<Alza> obtenerAlzaPorId(Integer id);
    List<Alza> obtenerTodasLasAlzas();
    void eliminarAlza(Integer id);
}
