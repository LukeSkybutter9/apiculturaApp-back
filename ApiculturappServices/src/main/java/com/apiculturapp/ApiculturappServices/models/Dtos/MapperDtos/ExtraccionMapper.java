package com.apiculturapp.ApiculturappServices.models.Dtos.MapperDtos;

import com.apiculturapp.ApiculturappServices.models.Dtos.entitiesDtos.ExtraccionDto;
import com.apiculturapp.ApiculturappServices.models.entities.Alza;
import com.apiculturapp.ApiculturappServices.models.entities.Extraccion;
import com.apiculturapp.ApiculturappServices.models.entities.Lote;
import com.apiculturapp.ApiculturappServices.models.entities.Panel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ExtraccionMapper {

    ExtraccionMapper INSTANCE = Mappers.getMapper(ExtraccionMapper.class);

    @Mapping(source = "alza", target = "idAlza", qualifiedByName = "alzaToId")
    @Mapping(source = "panel", target = "idPanel", qualifiedByName = "panelToId")
    @Mapping(source = "loteenvasado", target = "idLoteenvasado", qualifiedByName = "loteToId")
    ExtraccionDto toDto(Extraccion extraccion);

    @Mapping(source = "idAlza", target = "alza", qualifiedByName = "idToAlza")
    @Mapping(source = "idPanel", target = "panel", qualifiedByName = "idToPanel")
    @Mapping(source = "idLoteenvasado", target = "loteenvasado", qualifiedByName = "idToLote")
    Extraccion toEntity(ExtraccionDto extraccionDTO);

    @Named("alzaToId")
    default Integer alzaToId(Alza alza) {
        return alza != null ? alza.getIdAlza() : null;
    }

    @Named("panelToId")
    default Integer panelToId(Panel panel) {
        return panel != null ? panel.getIdPaneles() : null;
    }

    @Named("loteToId")
    default Integer loteToId(Lote lote) {
        return lote != null ? lote.getId_loteenvasado() : null;
    }

    // Métodos para convertir de ID a las entidades relacionadas
    @Named("idToAlza")
    default Alza idToAlza(Integer idAlza) {
        if (idAlza == null) {
            return null;
        }
        Alza alza = new Alza();
        alza.setIdAlza(idAlza);
        return alza;
    }

    @Named("idToPanel")
    default Panel idToPanel(Integer idPanel) {
        if (idPanel == null) {
            return null;
        }
        Panel panel = new Panel();
        panel.setIdPaneles(idPanel);
        return panel;
    }

    @Named("idToLote")
    default Lote idToLote(Integer idLote) {
        if (idLote == null) {
            return null;
        }
        Lote lote = new Lote();
        lote.setId_loteenvasado(idLote);
        return lote;
    }
}