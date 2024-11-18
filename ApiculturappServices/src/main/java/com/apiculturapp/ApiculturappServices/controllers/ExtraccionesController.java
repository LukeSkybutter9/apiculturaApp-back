package com.apiculturapp.ApiculturappServices.controllers;

import com.apiculturapp.ApiculturappServices.models.entities.Extraccion;
import com.apiculturapp.ApiculturappServices.services.IExtraccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/extracciones")
public class ExtraccionesController {

    private final IExtraccionService extraccionService;

    public ExtraccionesController(IExtraccionService extraccionService) {
        this.extraccionService = extraccionService;
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<Extraccion>> obtenerTodasExtracciones() {return ResponseEntity.ok(extraccionService.obtenerTodasLasExtracciones());}

    @GetMapping("/obtener/{id}")
    public ResponseEntity<Extraccion> obtenerExtraccionPorId(@PathVariable Integer id) {
        Extraccion extract = extraccionService.obtenerExtraccionPorId(id).orElseThrow(()-> new RuntimeException("Extracción no encontrada"));
        return ResponseEntity.ok(extract);
    }

    @PostMapping("/crear")
    public ResponseEntity<Extraccion> crear(@RequestBody Extraccion extraccion) {
        return ResponseEntity.ok(extraccionService.crearExtraccion(extraccion));
    }
}
