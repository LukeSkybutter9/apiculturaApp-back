package com.apiculturapp.ApiculturappServices.controllers;

import com.apiculturapp.ApiculturappServices.models.entities.Panel;
import com.apiculturapp.ApiculturappServices.services.IPanelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/panel")
public class PanelController {

    private final IPanelService panelService;

    public PanelController(IPanelService panelService) {
        this.panelService = panelService;
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<Panel>> obtenerTodosPaneles() {return ResponseEntity.ok(panelService.obtenerTodosLosPaneles());}

    @GetMapping("/obtener/{id}")
    public ResponseEntity<Panel> obtenerPanelPorId(@PathVariable Integer id) {
        Panel panel = panelService.obtenerPanelPorId(id).orElseThrow(()-> new RuntimeException("Panel no encontrado"));
        return ResponseEntity.ok(panel);
    }

    @PostMapping("/crear")
    public ResponseEntity<Panel> crear(@RequestBody Panel panel) {
        return ResponseEntity.ok(panelService.crearPanel(panel));
    }
}
