FROM openjdk:8-jdk-alpine
#FROM maven:3.5.2-jdk-8-alpine
VOLUME /tmp
#COPY . /target/*.jar app.jar
#RUN cd . /home/vsts/work/1/a/target/
#RUN echo ****** THIS IS THE DIRECTORY ****** &(ls)
COPY demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 

#/home/vsts/work/1/a