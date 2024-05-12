INSERT INTO users (username, password, enabled)
VALUES ('user1',
        '$2a$12$36iWQX8tQ6RCpOC7GKCb8.ClO84wqJMw3kcqUtHVon.VAR5X605ia', true),
       ('yama',
        '$2a$12$36iWQX8tQ6RCpOC7GKCb8.ClO84wqJMw3kcqUtHVon.VAR5X605ia', true);

INSERT INTO authorities (username, authority)
VALUES ('user1',
        'read'),
       ('yama',
        'admin');

INSERT INTO customer VALUES ('tanka', '$2a$12$36iWQX8tQ6RCpOC7GKCb8.ClO84wqJMw3kcqUtHVon.VAR5X605ia', 'read');
INSERT INTO customer VALUES ('tanka2', '$2a$12$36iWQX8tQ6RCpOC7GKCb8.ClO84wqJMw3kcqUtHVon.VAR5X605ia', 'read');