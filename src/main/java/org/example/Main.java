package org.example;

import org.example.dto.UserApiDTO;
import org.example.mapper.UserMapper;
import org.example.model.User;
import org.example.service.RandomUserClient;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        RandomUserClient client = new RandomUserClient();

        List<UserApiDTO> dtos = client.fetchUsers(3);

        List<User> users = dtos.stream()
                .map(UserMapper::toEntity)
                .toList();

        users.forEach(u -> System.out.println(u.getFullName() + " -> " + u.getEmail()));
    }
}

