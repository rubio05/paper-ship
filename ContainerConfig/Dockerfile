FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN echo this is the path $(pwd)
COPY /home/vsts/work/1/s/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 