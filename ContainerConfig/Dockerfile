FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN mvn clean install
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]