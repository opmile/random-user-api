package org.example.mapper;

import org.example.dto.UserApiDTO;
import org.example.model.Gender;
import org.example.model.Location;
import org.example.model.User;

public class UserMapper {
    public static User toEntity(UserApiDTO dto) {
        String fullName = dto.name().first() + " " + dto.name().last();
        Gender gender = Gender.fromText(dto.gender());
        Location location = LocationMapper.toEntity(dto.location());

        return new User(
                dto.login().uuid(),
                fullName,
                dto.login().username(),
                dto.email(),
                dto.dob().age(),
                gender,
                location
        );
    }
}
