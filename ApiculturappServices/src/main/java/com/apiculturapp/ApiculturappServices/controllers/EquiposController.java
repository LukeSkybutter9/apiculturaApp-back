package com.apiculturapp.ApiculturappServices.controllers;

import com.apiculturapp.ApiculturappServices.models.entities.Equipo;
import com.apiculturapp.ApiculturappServices.services.IEquipoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
public class EquiposController {

    private final IEquipoService equipoService;


    public EquiposController(IEquipoService equipoService) {
        this.equipoService = equipoService;
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<Equipo>> obtenerLosEquipos() {
        return ResponseEntity.ok(equipoService.obtenerTodosLosEquipos());
    }

    @PostMapping("/crear")
    public ResponseEntity<Equipo> crearEquipo(@RequestBody Equipo equipo) {
        return ResponseEntity.ok(equipoService.crearEquipo(equipo));
    }

    @GetMapping("/obtener/{id}")
    public ResponseEntity<Equipo> obtenerLosEquipos(@PathVariable Integer id) {
        Equipo equipo = equipoService.obtenerEquipoPorId(id).orElseThrow(()-> new RuntimeException("Equipo no encontrado"));
        return ResponseEntity.ok(equipo);
    }

}
