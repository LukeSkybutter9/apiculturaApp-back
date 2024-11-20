package com.apiculturapp.ApiculturappServices.controllers;

import com.apiculturapp.ApiculturappServices.models.Dtos.MapperDtos.ExtraccionMapper;
import com.apiculturapp.ApiculturappServices.models.entities.Extraccion;
import com.apiculturapp.ApiculturappServices.models.Dtos.entitiesDtos.ExtraccionDto;
import com.apiculturapp.ApiculturappServices.services.IExtraccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/extracciones")
public class ExtraccionesController {

    private final IExtraccionService extraccionService;
    private final ExtraccionMapper extraccionMapper = ExtraccionMapper.INSTANCE;

    public ExtraccionesController(IExtraccionService extraccionService, ExtraccionMapper extraccionMapper) {
        this.extraccionService = extraccionService;
    }

    @GetMapping("/obtener")
    public ResponseEntity<List<ExtraccionDto>> obtenerTodasExtracciones() {
        List<ExtraccionDto> extraccionDtos = extraccionService.obtenerTodasLasExtracciones().stream()
                .map(extraccionMapper::toDto)
                .toList();
        return ResponseEntity.ok(extraccionDtos);
    }


    @GetMapping("/obtener/{id}")
    public ResponseEntity<ExtraccionDto> obtenerExtraccionPorId(@PathVariable Integer id) {
        Extraccion extraccion = extraccionService.obtenerExtraccionPorId(id)
                .orElseThrow(() -> new RuntimeException("Extracción no encontrada"));
        ExtraccionDto extraccionDto = extraccionMapper.toDto(extraccion);
        return ResponseEntity.ok(extraccionDto);
    }

    @PostMapping("/crear")
    public ResponseEntity<ExtraccionDto> crear(@RequestBody ExtraccionDto extraccionDto) {
        Extraccion extraccion = extraccionMapper.toEntity(extraccionDto);
        Extraccion nuevaExtraccion = extraccionService.crearExtraccion(extraccion);
        ExtraccionDto nuevaExtraccionDto = extraccionMapper.toDto(nuevaExtraccion);
        return ResponseEntity.ok(nuevaExtraccionDto);
    }
}