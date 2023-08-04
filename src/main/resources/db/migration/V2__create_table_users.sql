CREATE TABLE users (
  id varchar(50) PRIMARY KEY NOT NULL,
  login varchar(50) NOT NULL UNIQUE,
  password varchar(100) NOT NULL,
  role varchar(50) NOT NULL
);