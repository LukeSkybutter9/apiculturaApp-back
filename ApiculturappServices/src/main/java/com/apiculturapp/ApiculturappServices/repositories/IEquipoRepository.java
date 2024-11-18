package com.apiculturapp.ApiculturappServices.repositories;

import com.apiculturapp.ApiculturappServices.models.entities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEquipoRepository extends JpaRepository<Equipo, Integer> {
}
