#!/usr/bin/env bash

export IMAGE=$1

docker-compose stop
docker-compose -f docker-compose.yml up -d
echo "success!"