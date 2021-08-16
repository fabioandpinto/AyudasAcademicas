#!/bin/sh
mvn clean package && docker build -t com.uraku/proyectoAyudas .
docker rm -f proyectoAyudas || true && docker run -d -p 9080:9080 -p 9443:9443 --name proyectoAyudas com.uraku/proyectoAyudas