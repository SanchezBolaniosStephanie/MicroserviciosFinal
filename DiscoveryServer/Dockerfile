FROM openjdk:8u151-slim
MAINTAINER Stephanie Sanchez "stephaniesb06@gmail.com"
COPY /target/DiscoveryServer-0.0.1-SNAPSHOT.jar /opt/DiscoveryServer-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/DiscoveryServer-0.0.1-SNAPSHOT.jar"]