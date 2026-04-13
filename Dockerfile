FROM maven:3.8.1-openjdk-8 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:8-jre-slim
WORKDIR /app
COPY --from=build /app/target/course_registration_system-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]