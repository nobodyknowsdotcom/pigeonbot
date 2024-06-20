DROP TABLE IF EXISTS users CASCADE;

CREATE TABLE users
(
    id                  UUID            PRIMARY KEY,
    telegram_id         BIGINT          NOT NULL,
    username            VARCHAR(64)     NOT NULL,
    chat_id             VARCHAR(64)     NOT NULL,
    state               VARCHAR(64)     NOT NULL,

    UNIQUE(telegram_id, chat_id)
);



