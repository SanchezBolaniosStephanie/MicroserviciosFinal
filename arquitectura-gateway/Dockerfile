FROM openjdk:8u151-slim
MAINTAINER Stephanie Sanchez "stephaniesb06@gmail.com"
COPY /target/arquitectura-gateway-1.0-SNAPSHOT.jar /opt/arquitectura-gateway-1.0-SNAPSHOT.jar
EXPOSE 8765
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/arquitectura-gateway-1.0-SNAPSHOT.jar"]
