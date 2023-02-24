
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template


FROM amazoncorretto:8-alpine-jdk

MAINTAINER patricia

COPY target/integrador-0.0.1-SNAPSHOT.jar  integrador-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/integrador-0.0.1-SNAPSHOT.jar"]