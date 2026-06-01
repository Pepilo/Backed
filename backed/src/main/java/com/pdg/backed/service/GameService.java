package com.pdg.backed.service;

import java.util.List;
import java.util.UUID;

import com.pdg.backed.domain.CreateGameRequest;
import com.pdg.backed.domain.UpdateGameRequest;
import com.pdg.backed.domain.entity.Game;

public interface GameService {

    Game createGame(CreateGameRequest request);

    List<Game> getGames();

    Game updateGame(UUID gameId, UpdateGameRequest request);

    void deleteGame(UUID gameId);
}