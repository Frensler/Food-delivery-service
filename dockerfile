FROM openjdk:21

WORKDIR /app

COPY target/app-0.0.1-SNAPSHOT.jar /app/app-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/app-0.0.1-SNAPSHOT.jar"]
