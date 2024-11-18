package com.apiculturapp.ApiculturappServices.repositories;

import com.apiculturapp.ApiculturappServices.models.entities.Lote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.Inet4Address;

public interface ILoteRepository extends JpaRepository<Lote, Integer> {
}
