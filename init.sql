DROP TABLE IF EXISTS  user;
CREATE TABLE user (
    id SERIAL PRIMARY KEY,
    "name" VARCHAR(511),
    email VARCHAR(255),
    rating INTEGER
);

DROP TABLE IF EXISTS "region";
CREATE TABLE "region" (
    id SERIAL PRIMARY KEY,
    "location" point
);

DROP TABLE IF EXISTS  user_region;
CREATE TABLE user_region(
    id SERIAL PRIMARY KEY,
    user_id INTEGER NOT NULL,
    region_id INTEGER NOT NULL,
    FOREIGN KEY(user_id) REFERENCES user(id),
    FOREIGN KEY(region_id) REFERENCES region(id)
);

CREATE TABLE IF NOT EXISTS "event" (
    id SERIAL PRIMARY KEY,
    "name" VARCHAR(255),varchar
    "emergency" BOOLEAN NOT NULL,
    icon TEXT
);

CREATE TABLE iF NOT EXISTS "ocurrency" (
    id SERIAL PRIMARY KEY,
    event_id INTEGER NOT NULL,
    "location" point NOT NULL,
    "data" json NOT NULL
);

INSERT INTO user(name, email, rating) VALUES 
(
    "user_1",
    "user1@gmail.com",
    10
),
(
    "user_2",
    "user2@gmail.com",
    9
);