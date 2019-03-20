FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN pwd
COPY ./target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 