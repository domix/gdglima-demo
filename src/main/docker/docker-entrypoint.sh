#!/usr/bin/env bash

java -Djava.security.egd=file:/dev/./urandom -Xms128m -Xmx128m -Duser.timezone="America/Mexico_City" -jar /app/application.jar