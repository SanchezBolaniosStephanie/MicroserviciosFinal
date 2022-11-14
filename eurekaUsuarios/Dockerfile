FROM openjdk:8u151-slim
MAINTAINER Stephanie Sanchez "stephaniesb06@gmail.com"
COPY /target/eurekaUsuarios-1.0-SNAPSHOT.jar /opt/eurekaUsuarios-1.0-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/eurekaUsuarios-1.0-SNAPSHOT.jar"]