FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /home/vsts/work/1/a/target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 