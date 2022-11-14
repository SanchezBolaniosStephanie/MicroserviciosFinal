FROM openjdk:8u151-slim
MAINTAINER Stephanie Sanchez "stephaniesb06@gmail.com"
COPY /target/EurekaPublicaciones-1.0-SNAPSHOT.jar /opt/EurekaPublicaciones-1.0-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/EurekaPublicaciones-1.0-SNAPSHOT.jar"]