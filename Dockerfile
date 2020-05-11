FROM openjdk:8
EXPOSE 8080
ADD target/student-app.jar student-app.jar
ENTRYPOINT ["java","-jar","/student-app.jar"]