DROP TABLE IF EXISTS users CASCADE;
CREATE TABLE users
(
    chat_id             BIGINT      PRIMARY KEY,
    is_subscribed       BOOLEAN     UNIQUE          NOT NULL
);

DROP TABLE IF EXISTS pigeons CASCADE;
CREATE TABLE pigeons
(
    id                  UUID        PRIMARY KEY,
    name                VARCHAR     UNIQUE          NOT NULL,
    image_url           VARCHAR     UNIQUE          NOT NULL
);

DROP TABLE IF EXISTS daily_pigeon CASCADE;
CREATE TABLE daily_pigeon
(
    id                  UUID        PRIMARY KEY,
    one_row_id          BOOLEAN     UNIQUE          NOT NULL    DEFAULT TRUE,

    FOREIGN KEY (id) REFERENCES pigeons (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);




