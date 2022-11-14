#!/usr/bin/env sh

docker build -f Dockerfile -t discovery-server .
#docker run -p 8761:8761 discovery-server