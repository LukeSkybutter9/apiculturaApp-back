package com.apiculturapp.ApiculturappServices.services;

import com.apiculturapp.ApiculturappServices.models.entities.Panel;

import java.util.List;
import java.util.Optional;

public interface IPanelService {
    Panel crearPanel(Panel panel);
    Optional<Panel> obtenerPanelPorId(Integer id);
    List<Panel> obtenerTodosLosPaneles();
    void eliminarPanel(Integer id);
}
