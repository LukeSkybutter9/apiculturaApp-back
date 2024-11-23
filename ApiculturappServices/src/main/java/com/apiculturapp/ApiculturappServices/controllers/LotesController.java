package com.apiculturapp.ApiculturappServices.controllers;

import com.apiculturapp.ApiculturappServices.models.entities.Lote;
import com.apiculturapp.ApiculturappServices.services.ILoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lotes")
@CrossOrigin(origins = "http://localhost:8080")
public class LotesController {

    private final ILoteService loteService;

    public LotesController(ILoteService loteService) {
        this.loteService = loteService;
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<Lote>> obtenerTodosLotes() {return ResponseEntity.ok(loteService.obtenerTodosLosLotes());}

    @GetMapping("/obtener/{id}")
    public ResponseEntity<Lote> obtenerLotePorId(@PathVariable Integer id) {
        Lote lote = loteService.obtenerLotePorId(id).orElseThrow(()-> new RuntimeException("Lote no encontrado"));
        return ResponseEntity.ok(lote);
    }

    @PostMapping("/crear")
    public ResponseEntity<Lote> crear(@RequestBody Lote lote) {
        return ResponseEntity.ok(loteService.crearLote(lote));
    }
}
