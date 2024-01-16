FROM openjdk:17-jdk-alpine
EXPOSE 8040
ADD target/continent-service-0.0.1-SNAPSHOT.jar continent-service.jar
ENTRYPOINT ["java", "-jar", "continent-service.jar"]