package com.apiculturapp.ApiculturappServices.repositories;

import com.apiculturapp.ApiculturappServices.models.entities.Insumo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInsumoRepository extends JpaRepository<Insumo, Integer> {
}
