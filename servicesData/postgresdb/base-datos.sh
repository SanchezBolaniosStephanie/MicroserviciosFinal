#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
  CREATE USER admin PASSWORD 'admin';

  CREATE DATABASE red_social_usuarios OWNER admin;
  GRANT ALL PRIVILEGES ON DATABASE red_social_usuarios TO admin;

  CREATE DATABASE red_social_amigos OWNER admin;
  GRANT ALL PRIVILEGES ON DATABASE red_social_amigos TO admin;

  CREATE DATABASE red_social_publicaciones OWNER admin;
  GRANT ALL PRIVILEGES ON DATABASE red_social_publicaciones TO admin;

  CREATE DATABASE red_social_reacciones OWNER admin;
  GRANT ALL PRIVILEGES ON DATABASE red_social_reacciones TO admin;

  CREATE DATABASE red_social_accesos OWNER admin;
  GRANT ALL PRIVILEGES ON DATABASE red_social_accesos TO admin;
EOSQL