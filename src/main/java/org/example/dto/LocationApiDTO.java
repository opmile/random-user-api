package org.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LocationApiDTO(
        LocationStreetApiDTO street,
        String city,
        String state,
        String country
) {}
