package com.apiculturapp.ApiculturappServices.models.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "Insumos")
@Getter
@Setter
public class Insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_insumo", nullable = false)
    private Integer idInsumo;

    @Size(max = 100)
    @NotNull
    @Column(name = "nombre_equipo", nullable = false, length = 100)
    private String nombre;

    @NotNull
    @Column(name = "cantidad_total", nullable = false)
    private Integer cantTotal;

    @NotNull
    @Column(name = "cantidad_disponible", nullable = false)
    private Integer cantDisponible;

    @Size(max = 100)
    @NotNull
    @Column(name = "tipo_insumo", nullable = false, length = 100)
    private String tipoInsumo;
}
