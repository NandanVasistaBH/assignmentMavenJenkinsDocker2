FROM openjdk:8
COPY target/assignment-*.jar /assignment-maven.jar
java -cp foo.jar full.package.name.ClassName
CMD ["java","-cp", "/assignment-maven.jar", "com.telstra.assignment.bookutil"]