FROM openjdk:8-jdk-alpine
VOLUME /app
#COPY . /target/*.jar app.jar
RUN cd . /home/vsts/work/1/a/target/
RUN echo ****** THIS IS THE DIRECTORY ****** &(ls)
COPY . /appsdfsdfsd/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 

#/home/vsts/work/1/a