package org.example.mapper;

import org.example.dto.LocationApiDTO;
import org.example.model.Location;

public class LocationMapper {
    public static Location toEntity(LocationApiDTO dto) {
        String street = String.valueOf(dto.street().number()) + dto.street().name();
        return new Location(
                street,
                dto.city(),
                dto.state(),
                dto.country()
        );
    }
}
