CREATE TABLE "event" (
    id SERIAL PRIMARY KEY,
    "name" varchar(255),
    "emergency" BOOLEAN NOT NULL
);


CREATE TABLE "ocurrency" (
    id SERIAL PRIMARY KEY,
    event_id INTEGER NOT NULL,
    "location" point NOT NULL,
    "data" json NOT NULL
);
