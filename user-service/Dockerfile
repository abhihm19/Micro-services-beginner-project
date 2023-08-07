FROM eclipse-temurin:8

WORKDIR /app

COPY target/user-service-0.0.1-SNAPSHOT.jar /app/user-service.jar

ENTRYPOINT [ "java", "-jar", "user-service.jar" ]