package com.pdg.backed.domain;

import java.time.LocalDate;

public record UpdateGameRequest(String title, String imageUrl, String description, LocalDate release) {}