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
    "latitude" DOUBLE PRECISION NOT NULL,
    "longitude" DOUBLE PRECISION NOT NULL
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
    "latitude" DOUBLE PRECISION NOT NULL,
    "longitude" DOUBLE PRECISION NOT NULL,
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

INSERT INTO region(latitude, longitude) VALUES(
    -22.906847,
    -43.172897
);

insert into event(name, emergency, icon)
values ('Habitação e urbanismo', false, 'localhost:8000/habit_urban.jpg');

insert into event(name, emergency, icon)
values ('Acessibilidade', false, 'localhost:8000/acessibilidade.jpg');

insert into event(name, emergency, icon)
values ('Saneamento', false, 'localhost:8000/saneamento.jpg');

insert into event(name, emergency, icon)
values ('Depredação', false, 'localhost:8000/depredacao.jpg');

insert into event(name, emergency, icon)
values ('Catástrofe', true, 'localhost:8000/catastrofe.jpg');

insert into event(name, emergency, icon)
values ('Assalto', true, 'localhost:8000/assalto.jpg');

insert into event(name, emergency, icon)
values ('Arrastão', true, 'localhost:8000/arrastao.jpg');

insert into event(name, emergency, icon)
values ('Acidente de Trânsito', true, 'localhost:8000/acidente_transito.jpg');
