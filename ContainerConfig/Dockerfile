FROM openjdk:8-jdk-alpine
VOLUME /tmp
WORKDIR /app
COPY /target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 

#/home/vsts/work/1/a