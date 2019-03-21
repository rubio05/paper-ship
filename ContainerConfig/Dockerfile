FROM openjdk:8-jdk-alpine
VOLUME /app
#COPY . /target/*.jar app.jar
RUN echo ****** THIS IS THE DIRECTORY ****** &(ls app/)
COPY . /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 

#/home/vsts/work/1/a