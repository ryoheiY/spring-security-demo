INSERT INTO users (username, password, enabled)
VALUES ('user1',
        'pass1', true),
       ('yama',
        'kawa', true);

INSERT INTO authorities (username, authority)
VALUES ('user1',
        'read'),
       ('yama',
        'admin');
