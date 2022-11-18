#!/usr/bin/env sh
mvn clean install #-Dmaven.clean.failOnError=false && mvn clean -Dmaven.clean.failOnError=false
docker build -f Dockerfile -t gateway-server .
