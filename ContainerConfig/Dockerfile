FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN ./mvnw install -DskipTests
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]