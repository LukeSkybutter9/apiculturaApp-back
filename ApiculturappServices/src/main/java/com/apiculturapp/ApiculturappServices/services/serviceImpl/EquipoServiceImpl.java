package com.apiculturapp.ApiculturappServices.services.serviceImpl;

import com.apiculturapp.ApiculturappServices.models.entities.Equipo;
import com.apiculturapp.ApiculturappServices.repositories.IEquipoRepository;
import com.apiculturapp.ApiculturappServices.services.IEquipoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoServiceImpl implements IEquipoService {

    private IEquipoRepository equipoRepository;

    @Override
    public Equipo crearEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public Optional<Equipo> obtenerEquipoPorId(Integer id) {
        return equipoRepository.findById(id);
    }

    @Override
    public List<Equipo> obtenerTodosLosEquipos() {
        return equipoRepository.findAll();
    }

    @Override
    public void eliminarEquipo(Integer id) {
        equipoRepository.deleteById(id);
    }

    @Override
    public Equipo actualizarEquipo(Integer id, Equipo detallesEquipo) {
        Optional<Equipo> equipo = equipoRepository.findById(id);
        if (equipo.isPresent()) {
            Equipo equipoActual = equipo.get();
            equipoActual.setNombre(detallesEquipo.getNombre());
            return equipoRepository.save(equipoActual);
        }else {
            throw new RuntimeException("Equipo no encontrado con id " + id);
        }
    }
}
