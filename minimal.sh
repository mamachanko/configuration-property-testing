#!/usr/bin/env bash -ex

./mvnw \
    clean \
    spring-boot:run \
    -Dspring.profiles.active=minimal