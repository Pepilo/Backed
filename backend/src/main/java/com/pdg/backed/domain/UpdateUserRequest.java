package com.pdg.backed.domain;

public record UpdateUserRequest(String email, String password, String userName) {}