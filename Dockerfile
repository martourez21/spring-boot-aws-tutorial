FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

copy target/spring-boot-aws-tutorial-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]