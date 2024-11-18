package com.apiculturapp.ApiculturappServices.models.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "Alzas")
public class Alza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alza", nullable = false)
    private Integer idAlza;

    @OneToMany(mappedBy = "Alzas", fetch = FetchType.LAZY)
    private Set<Extraccion> extraccion = new LinkedHashSet<>();
}
