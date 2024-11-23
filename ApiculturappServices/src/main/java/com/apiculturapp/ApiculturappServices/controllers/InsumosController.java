package com.apiculturapp.ApiculturappServices.controllers;

import com.apiculturapp.ApiculturappServices.models.entities.Insumo;
import com.apiculturapp.ApiculturappServices.services.IInsumoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insumos")
@CrossOrigin(origins = "http://localhost:8080")
public class InsumosController {

    private final IInsumoService insumoService;

    public InsumosController(IInsumoService insumoService) {
        this.insumoService = insumoService;
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<Insumo>> obtenerTodosInsumos() {return ResponseEntity.ok(insumoService.obtenerTodosLosInsumos());}

    @GetMapping("/obtener/{id}")
    public ResponseEntity<Insumo> obtenerInsumoPorId(@PathVariable Integer id) {
        Insumo insumo = insumoService.obtenerInsumoPorId(id).orElseThrow(()-> new RuntimeException("Insumo no encontrado"));
        return ResponseEntity.ok(insumo);
    }

    @PostMapping("/crear")
    public ResponseEntity<Insumo> crear(@RequestBody Insumo insumo) {
        return ResponseEntity.ok(insumoService.crearInsumo(insumo));
    }
}
