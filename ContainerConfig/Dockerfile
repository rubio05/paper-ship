FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN /usr/share/apache-maven-3.6.0/bin/mvn -f /home/vsts/work/1/s/pom.xml package
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 