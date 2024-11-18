package com.apiculturapp.ApiculturappServices.models.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "Lotes")
public class Lote {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loteenvasado", nullable = false)
    private Integer id_loteenvasado;

    @NotNull
    @Column(name = "cantidad_envasada", nullable = false)
    private Integer cantEnvasada;

    @NotNull
    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @NotNull
    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Size(max = 100)
    @NotNull
    @Column(name = "tipo_producto", nullable = false, length = 100)
    private String tipoProducto;

    @Size(max = 100)
    @NotNull
    @Column(name = "ubicacion", nullable = false, length = 100)
    private String ubicacion;

    @OneToMany(mappedBy = "Lotes", fetch = FetchType.LAZY)
    private Set<Extraccion> extraccion = new LinkedHashSet<>();
}
