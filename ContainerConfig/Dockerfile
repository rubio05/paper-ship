FROM openjdk:8-jdk-alpine
VOLUME /tmp
#COPY . /target/*.jar app.jar
RUN echo ****** THIS IS THE DIRECTORY ****** &(ls . /)
ADD . /*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 

#/home/vsts/work/1/a