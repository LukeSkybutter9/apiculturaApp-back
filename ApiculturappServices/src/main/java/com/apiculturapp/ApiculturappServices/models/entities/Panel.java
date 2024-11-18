package com.apiculturapp.ApiculturappServices.models.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "Paneles")
public class Panel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_panel", nullable = false)
    private Integer idPaneles;

    @OneToMany(mappedBy = "Paneles", fetch = FetchType.LAZY)
    private Set<Extraccion> extraccion = new LinkedHashSet<>();

}
