FROM adoptopenjdk/openjdk11
MAINTAINER ayrr
COPY target/pruebatecnica-0.0.1-SNAPSHOT.jar pruebatecnica-0.0.1-SNAPSHOT.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","/pruebatecnica-0.0.1-SNAPSHOT.jar"]