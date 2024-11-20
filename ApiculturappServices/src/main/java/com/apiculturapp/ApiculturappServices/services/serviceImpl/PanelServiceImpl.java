package com.apiculturapp.ApiculturappServices.services.serviceImpl;

import com.apiculturapp.ApiculturappServices.models.entities.Equipo;
import com.apiculturapp.ApiculturappServices.models.entities.Panel;
import com.apiculturapp.ApiculturappServices.repositories.IPanelRepository;
import com.apiculturapp.ApiculturappServices.services.IPanelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PanelServiceImpl implements IPanelService {

    private IPanelRepository panelRepository;

    public PanelServiceImpl(IPanelRepository panelRepository) {
        this.panelRepository = panelRepository;
    }

    @Override
    public Panel crearPanel(Panel panel) {
        return panelRepository.save(panel);
    }

    @Override
    public Optional<Panel> obtenerPanelPorId(Integer id) {
        return panelRepository.findById(id);
    }

    @Override
    public List<Panel> obtenerTodosLosPaneles() {
        return panelRepository.findAll();
    }

    @Override
    public void eliminarPanel(Integer id) {
        panelRepository.deleteById(id);
    }
}
