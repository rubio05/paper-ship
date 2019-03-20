FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN apt-get install maven
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 