package com.apiculturapp.ApiculturappServices.services.serviceImpl;

import com.apiculturapp.ApiculturappServices.models.entities.Lote;
import com.apiculturapp.ApiculturappServices.repositories.ILoteRepository;
import com.apiculturapp.ApiculturappServices.services.ILoteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoteServiceImpl implements ILoteService {

    private ILoteRepository loteRepository;

    @Override
    public Lote crearLote(Lote lote) {
        return loteRepository.save(lote);
    }

    @Override
    public Optional<Lote> obtenerLotePorId(Integer id) {
        return loteRepository.findById(id);
    }

    @Override
    public List<Lote> obtenerTodosLosLotes() {
        return loteRepository.findAll();
    }
}
