package com.apiculturapp.ApiculturappServices.controllers;

import com.apiculturapp.ApiculturappServices.models.entities.Alza;
import com.apiculturapp.ApiculturappServices.services.IAlzaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alza")
@CrossOrigin(origins = "http://localhost:8080")
public class AlzaController {

    private final IAlzaService alzaService;

    public AlzaController(IAlzaService alzaService) {
        this.alzaService = alzaService;
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<Alza>> obtenerTodasAlzas() {return ResponseEntity.ok(alzaService.obtenerTodasLasAlzas());}

    @GetMapping("/obtener/{id}")
    public ResponseEntity<Alza> obtenerAlzasPorId(@PathVariable Integer id) {
        Alza alza = alzaService.obtenerAlzaPorId(id).orElseThrow(()-> new RuntimeException("Alza no encontrada"));
        return ResponseEntity.ok(alza);
    }

    @PostMapping("/crear")
    public ResponseEntity<Alza> crear(@RequestBody Alza alza) {
        return ResponseEntity.ok(alzaService.crearAlza(alza));
    }

}
