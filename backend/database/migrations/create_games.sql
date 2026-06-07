DROP TABLE IF EXISTS games;

CREATE TABLE games(
    game_id UUID PRIMARY KEY,
    title VARCHAR(255) UNIQUE NOT NULL,
    image_url VARCHAR(255) UNIQUE NOT NULL,
    description TEXT,
    release DATE NOT NULL,
    created TIMESTAMP NOT NULL,
    updated TIMESTAMP NOT NULL
);