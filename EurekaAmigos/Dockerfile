FROM openjdk:8u151-slim
MAINTAINER Stephanie Sanchez "stephaniesb06@gmail.com"
COPY /target/EurekaAmigos-1.0-SNAPSHOT.jar /opt/EurekaAmigos-1.0-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/EurekaAmigos-1.0-SNAPSHOT.jar"]