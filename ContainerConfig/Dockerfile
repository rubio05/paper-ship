FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#RUN cd /home/vsts/work/1/s/
RUN echo this is the path $(pwd)
RUN echo this is the content $(ls)
COPY #{$(build.artifactstagingdirectory)}#/spring-app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 