#!/usr/bin/env sh

mvn clean install
docker build -f Dockerfile -t discovery-server .
#docker run -p 8761:8761 discovery-server
