FROM ubuntu:latest
LABEL authors="harshi"

FROM eclipse-temurin:17
COPY target/demo-0.0.1-SNAPSHOT.war app.war
ENTRYPOINT ["java","-jar","app.war"]
#CMD ["sleep","infinity"]
