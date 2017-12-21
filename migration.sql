CREATE DATABASE IF NOT EXISTS adlister2_db;

USE adlister2_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

# +----------+             +-------------+
# |  users   |             |    ads      |
# +----------+             +-------------+
# | id       |<------,     | id          |
# | username |       `-----| user_id     | <-- foreign key to users table
# | email    |             | title       |
# | password |             | description |
# +----------+             +-------------+


CREATE TABLE users
(
  id         INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(30),
  email      VARCHAR(30),
  password   VARCHAR(30),
  PRIMARY KEY (id)
);

CREATE TABLE ads
(
  id          INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  title       VARCHAR(255),
  description VARCHAR(255),
  user_id     INT UNSIGNED     NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);

