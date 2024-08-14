FROM openjdk:8
COPY target/assignment-*.jar /assignment-maven.jar
CMD ["java","-jar","/assignment-maven.jar"]