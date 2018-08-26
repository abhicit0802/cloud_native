#!/usr/bin/env bash
while ! nc -z configserver 9090 ; do
    echo "Waiting for the Config Server"
    sleep 3
done
while ! nc -z discoveryserver 9091 ; do
    echo "Waiting for the Discovery Server"
    sleep 3
done