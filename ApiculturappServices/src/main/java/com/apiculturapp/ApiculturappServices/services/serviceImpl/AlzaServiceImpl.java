package com.apiculturapp.ApiculturappServices.services.serviceImpl;

import com.apiculturapp.ApiculturappServices.models.entities.Alza;
import com.apiculturapp.ApiculturappServices.repositories.IAlzaRepository;
import com.apiculturapp.ApiculturappServices.services.IAlzaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlzaServiceImpl implements IAlzaService {

    private IAlzaRepository alzaRepository;

    public AlzaServiceImpl(IAlzaRepository alzaRepository) {
        this.alzaRepository = alzaRepository;
    }

    @Override
    public Alza crearAlza(Alza alza) {
        return alzaRepository.save(alza);
    }

    @Override
    public Optional<Alza> obtenerAlzaPorId(Integer id) {
        return alzaRepository.findById(id);
    }

    @Override
    public List<Alza> obtenerTodasLasAlzas() {
        return alzaRepository.findAll();
    }

    @Override
    public void eliminarAlza(Integer id) {
        alzaRepository.deleteById(id);
    }
}
