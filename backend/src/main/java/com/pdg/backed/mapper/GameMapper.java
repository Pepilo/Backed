package com.pdg.backed.mapper;

import com.pdg.backed.domain.CreateGameRequest;
import com.pdg.backed.domain.UpdateGameRequest;
import com.pdg.backed.domain.dto.CreateGameRequestDto;
import com.pdg.backed.domain.dto.GameDto;
import com.pdg.backed.domain.dto.UpdateGameRequestDto;
import com.pdg.backed.domain.entity.Game;

public interface GameMapper {

    CreateGameRequest fromDto(CreateGameRequestDto dto);

    UpdateGameRequest fromDto(UpdateGameRequestDto dto);

    GameDto toDto(Game game);
}