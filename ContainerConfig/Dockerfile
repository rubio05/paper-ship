FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#RUN cd /home/vsts/work/1/s/
RUN echo this is the path $(pwd)
RUN echo this is the content $(ls)
COPY /home/vsts/work/1/a/target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 