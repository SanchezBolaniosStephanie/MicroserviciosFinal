#!/usr/bin/env bash

cd DiscoveryServer
chmod u+x+r generaImagen.sh
./generaImagen.sh

cd ../

cd ArquitecturaMonitorService
chmod u+x+r generaImagen.sh
./generaImagen.sh

cd ../

cd arquitectura-gateway
chmod u+x+r generaImagen.sh
./generaImagen.sh

cd ../

cd eurekaUsuarios
chmod u+x+r generaImagen.sh
./generaImagen.sh

cd ../

cd EurekaAmigos
chmod u+x+r generaImagen.sh
./generaImagen.sh

cd ../

cd EurekaPublicaciones
chmod u+x+r generaImagen.sh
./generaImagen.sh

cd ../

docker-compose up --build
