package com.apiculturapp.ApiculturappServices.services;

import com.apiculturapp.ApiculturappServices.models.entities.Equipo;
import com.apiculturapp.ApiculturappServices.models.entities.Insumo;

import java.util.List;
import java.util.Optional;

public interface IInsumoService {

    Insumo crearInsumo(Insumo insumo);
    Optional<Insumo> obtenerInsumoPorId(Integer id);
    List<Insumo> obtenerTodosLosInsumos();
    void eliminarInsumo(Integer id);
    Insumo actualizarInsumo(Integer id, Insumo detallesInsumo);

}
