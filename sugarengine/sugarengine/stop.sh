#!/bin/bash
docker-compose -f docker-compose.base.yml -f docker-compose.image.yml -f docker-compose.map-ports.yml stop
