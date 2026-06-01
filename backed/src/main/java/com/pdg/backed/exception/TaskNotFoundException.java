package com.pdg.backed.exception;

import java.util.UUID;

public class TaskNotFoundException extends RuntimeException {

    private final UUID gameId;

    public TaskNotFoundException(UUID gameId) {
        super(String.format("Game with ID '%s' does not exist.", gameId));
        this.gameId = gameId;
    }

    public UUID getGameId() {
        return gameId;
    }
}