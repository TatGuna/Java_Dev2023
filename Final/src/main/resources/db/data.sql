# users

TRUNCATE TABLE users;

INSERT INTO users (username, encrypted_password, role, active)
values ('admin', '$2a$04$FK/bOGOv6wlm6VH6mSYJDuSzf9EAasHljhObh0c3sqLlnLcRpor4i', 'ADMIN', 1);

# notes

TRUNCATE TABLE notes;

