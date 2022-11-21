FROM openjdk:8u151-slim
MAINTAINER Stephanie Sanchez "stephaniesb06@gmail.com"
COPY /target/ArquitecturaMonitorService-1.0-SNAPSHOT.jar /opt/ArquitecturaMonitorService-1.0-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/ArquitecturaMonitorService-1.0-SNAPSHOT.jar"]