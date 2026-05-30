package com.pdg.backed.domain.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

public record GameDto(
    UUID uuid,
    String title,
    String imageUrl,
    String description,
    LocalDate release,
    Instant created,
    Instant updated
) {}