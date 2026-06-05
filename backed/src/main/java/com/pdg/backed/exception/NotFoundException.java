package com.pdg.backed.exception;

import java.util.UUID;

public class NotFoundException extends RuntimeException {

    private final UUID id;

    public NotFoundException(UUID id) {
        super(String.format("Entity with ID '%s' does not exist.", id));
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}