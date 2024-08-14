FROM openjdk:8
COPY target/assignment-*.jar /assignment-maven.jar
CMD ["java","-cp", "/assignment-maven.jar", "com.telstra.assignment.bookutil.BookUtil"]