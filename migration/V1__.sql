CREATE TABLE artists
(
    id        BIGINT AUTO_INCREMENT NOT NULL,
    firstname VARCHAR(255) NULL,
    lastname  VARCHAR(255) NULL,
    CONSTRAINT pk_artists PRIMARY KEY (id)
);