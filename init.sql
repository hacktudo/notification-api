DROP TABLE IF EXISTS  person;
CREATE TABLE person (
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

DROP TABLE IF EXISTS  person_region;
CREATE TABLE person_region(
    id SERIAL PRIMARY KEY,
    person_id INTEGER NOT NULL,
    region_id INTEGER NOT NULL,
    FOREIGN KEY(person_id) REFERENCES person(id),
    FOREIGN KEY(region_id) REFERENCES region(id)
);

CREATE TABLE IF NOT EXISTS "event" (
    id SERIAL PRIMARY KEY,
    "name" VARCHAR(255),
    "emergency" BOOLEAN NOT NULL,
    icon TEXT
);

CREATE TABLE iF NOT EXISTS "ocurrency" (
    id SERIAL PRIMARY KEY,
    event_id INTEGER NOT NULL,
    "location" point NOT NULL,
    "data" json NOT NULL
);

INSERT INTO person(name, email, rating) VALUES 
(
    'person_1',
    'person1@gmail.com',
    10
),
(
    'person_2',
    'person2@gmail.com',
    9
);