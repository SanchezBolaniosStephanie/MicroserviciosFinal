CREATE TABLE usuario (
  id                VARCHAR(255) PRIMARY KEY,
  nombre            VARCHAR(255) NOT NULL,
  apellido_paterno  VARCHAR(255) NOT NULL,
  rol               Integer,
  email             VARCHAR(255) NOT NULL,
  password          VARCHAR(255) NOT NULL,
  fecha_reg         VARCHAR(1000) NOT NULL
);