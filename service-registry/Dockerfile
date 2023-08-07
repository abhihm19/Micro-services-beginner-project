FROM eclipse-temurin:8

WORKDIR /app

COPY target/service-registry-0.0.1-SNAPSHOT.jar /app/service-registry.jar

ENTRYPOINT [ "java", "-jar", "service-registry.jar" ]