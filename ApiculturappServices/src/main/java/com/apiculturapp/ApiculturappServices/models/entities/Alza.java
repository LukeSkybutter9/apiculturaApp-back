package com.apiculturapp.ApiculturappServices.models.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "Alzas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Alza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alza", nullable = false)
    private Integer idAlza;

    @OneToMany(mappedBy = "alza", fetch = FetchType.LAZY)
    private Set<Extraccion> extraccion = new LinkedHashSet<>();
}
