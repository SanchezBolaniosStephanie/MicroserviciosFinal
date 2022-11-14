#!/usr/bin/env sh
mvn clean install
docker build -f Dockerfile -t eureka-usuarios .
#docker run -p 8081:8081 eureka-usuarios