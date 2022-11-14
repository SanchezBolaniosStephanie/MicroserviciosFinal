#!/usr/bin/env sh

mvn clean install
docker build -f Dockerfile -t eureka-amigos .