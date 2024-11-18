package com.apiculturapp.ApiculturappServices.repositories;

import com.apiculturapp.ApiculturappServices.models.entities.Panel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPanelRepository extends JpaRepository<Panel, Integer> {
}
