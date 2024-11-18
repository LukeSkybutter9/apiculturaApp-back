package com.apiculturapp.ApiculturappServices.models.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "Extracciones")
public class Extraccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Extraccion", nullable = false)
    private Integer idExtraccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alza")
    private Alza alza;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_panel")
    private Panel panel;

    @NotNull
    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @NotNull
    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_loteenvasado")
    private Lote loteenvasado;

    @NotNull
    @Column(name = "cantidad_cera", nullable = false)
    private Integer cantCera;
}
