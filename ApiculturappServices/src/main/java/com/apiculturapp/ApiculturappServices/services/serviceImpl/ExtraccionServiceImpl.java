package com.apiculturapp.ApiculturappServices.services.serviceImpl;

import com.apiculturapp.ApiculturappServices.models.entities.Extraccion;
import com.apiculturapp.ApiculturappServices.models.entities.Insumo;
import com.apiculturapp.ApiculturappServices.repositories.IExtraccionRepository;
import com.apiculturapp.ApiculturappServices.services.IExtraccionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExtraccionServiceImpl implements IExtraccionService {

    private IExtraccionRepository extraccionRepository;

    public ExtraccionServiceImpl(IExtraccionRepository extraccionRepository) {
        this.extraccionRepository = extraccionRepository;
    }

    @Override
    public Extraccion crearExtraccion(Extraccion extraccion) {
        return extraccionRepository.save(extraccion);
    }

    @Override
    public Optional<Extraccion> obtenerExtraccionPorId(Integer id) {
        return extraccionRepository.findById(id);
    }

    @Override
    public List<Extraccion> obtenerTodasLasExtracciones() {
        return extraccionRepository.findAll();
    }

}
