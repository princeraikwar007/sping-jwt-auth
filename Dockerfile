FROM openjdk:8
EXPOSE 8085
ADD target/jwt-auth-app.jar jwt-auth-app.jar
ENTRYPOINT ["java","-jar","/jwt-auth-app.jar"]