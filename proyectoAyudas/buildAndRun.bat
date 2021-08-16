@echo off
call mvn clean package
call docker build -t com.uraku/proyectoAyudas .
call docker rm -f proyectoAyudas
call docker run -d -p 9080:9080 -p 9443:9443 --name proyectoAyudas com.uraku/proyectoAyudas