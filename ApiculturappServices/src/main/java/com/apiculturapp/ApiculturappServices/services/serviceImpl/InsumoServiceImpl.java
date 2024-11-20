package com.apiculturapp.ApiculturappServices.services.serviceImpl;

import com.apiculturapp.ApiculturappServices.models.entities.Insumo;
import com.apiculturapp.ApiculturappServices.repositories.IInsumoRepository;
import com.apiculturapp.ApiculturappServices.services.IInsumoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsumoServiceImpl implements IInsumoService {

    private IInsumoRepository insumoRepository;

    public InsumoServiceImpl(IInsumoRepository insumoRepository) {
        this.insumoRepository = insumoRepository;
    }

    @Override
    public Insumo crearInsumo(Insumo insumo) {
        if(insumo.getCantDisponible()>insumo.getCantTotal()){
            throw new RuntimeException("La cantidad disponible no puede ser mayor que la cantidad total");
        }else{
            return insumoRepository.save(insumo);
        }
    }

    @Override
    public Optional<Insumo> obtenerInsumoPorId(Integer id) {
        return insumoRepository.findById(id);
    }

    @Override
    public List<Insumo> obtenerTodosLosInsumos() {
        return insumoRepository.findAll();
    }

    @Override
    public void eliminarInsumo(Integer id) {
        insumoRepository.deleteById(id);
    }

    @Override
    public Insumo actualizarInsumo(Integer id, Insumo detallesEquipo) {
        Optional<Insumo> insumo = insumoRepository.findById(id);
        if (insumo.isPresent()) {
            Insumo insumoActual = insumo.get();
            insumoActual.setNombre(detallesEquipo.getNombre());
            return insumoRepository.save(insumoActual);
        }else {
            throw new RuntimeException("Insumo no encontrado con id " + id);
        }
    }
}
