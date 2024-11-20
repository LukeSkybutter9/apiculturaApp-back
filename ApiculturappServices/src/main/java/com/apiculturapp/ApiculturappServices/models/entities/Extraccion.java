package com.apiculturapp.ApiculturappServices.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "Extracciones")
@Getter
@Setter
public class Extraccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_extraccion", nullable = false)
    private Integer idExtraccion;

    @NotNull
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @NotNull
    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alza")
    private Alza alza;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_panel")
    private Panel panel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_loteenvasado")
    private Lote loteenvasado;

    @NotNull
    @Column(name = "cantidad_cera", nullable = false)
    private Integer cantCera;

}
