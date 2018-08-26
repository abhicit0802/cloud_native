#!/usr/bin/env bash

for i in $(seq 1 5); do docker-machine create --driver virtualbox node$i; done;
docker-machine ssh node1 "docker swarm init --advertise-addr 192.168.99.100"

