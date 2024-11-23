package com.apiculturapp.ApiculturappServices.models.Dtos.MapperDtos;

import com.apiculturapp.ApiculturappServices.models.Dtos.entitiesDtos.ExtraccionDto;
import com.apiculturapp.ApiculturappServices.models.entities.Extraccion;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-21T18:17:14-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class ExtraccionMapperImpl implements ExtraccionMapper {

    @Override
    public ExtraccionDto toDto(Extraccion extraccion) {
        if ( extraccion == null ) {
            return null;
        }

        ExtraccionDto extraccionDto = new ExtraccionDto();

        extraccionDto.setIdAlza( alzaToId( extraccion.getAlza() ) );
        extraccionDto.setIdPanel( panelToId( extraccion.getPanel() ) );
        extraccionDto.setIdLoteenvasado( loteToId( extraccion.getLoteenvasado() ) );
        extraccionDto.setIdExtraccion( extraccion.getIdExtraccion() );
        extraccionDto.setFecha( extraccion.getFecha() );
        extraccionDto.setHora( extraccion.getHora() );
        extraccionDto.setCantCera( extraccion.getCantCera() );

        return extraccionDto;
    }

    @Override
    public Extraccion toEntity(ExtraccionDto extraccionDTO) {
        if ( extraccionDTO == null ) {
            return null;
        }

        Extraccion extraccion = new Extraccion();

        extraccion.setAlza( idToAlza( extraccionDTO.getIdAlza() ) );
        extraccion.setPanel( idToPanel( extraccionDTO.getIdPanel() ) );
        extraccion.setLoteenvasado( idToLote( extraccionDTO.getIdLoteenvasado() ) );
        extraccion.setIdExtraccion( extraccionDTO.getIdExtraccion() );
        extraccion.setFecha( extraccionDTO.getFecha() );
        extraccion.setHora( extraccionDTO.getHora() );
        extraccion.setCantCera( extraccionDTO.getCantCera() );

        return extraccion;
    }
}
