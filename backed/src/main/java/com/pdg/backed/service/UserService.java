package com.pdg.backed.service;

import java.util.List;
import java.util.UUID;

import com.pdg.backed.domain.CreateUserRequest;
import com.pdg.backed.domain.UpdateUserRequest;
import com.pdg.backed.domain.entity.User;

public interface UserService {

    User createUser(CreateUserRequest request);

    List<User> getUsers();

    User updateUser(UUID userId, UpdateUserRequest request);

    void deleteUser(UUID userId);
}