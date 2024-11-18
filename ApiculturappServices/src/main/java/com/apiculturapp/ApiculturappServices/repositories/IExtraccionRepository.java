package com.apiculturapp.ApiculturappServices.repositories;

import com.apiculturapp.ApiculturappServices.models.entities.Extraccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExtraccionRepository extends JpaRepository<Extraccion, Integer> {
}
