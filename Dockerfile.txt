FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY mnvw pom.xml ./
COPY .mvn .mvn
COPY src src
RUN chmod +x mvnw && ./mvnw -DskipTests package

FROM eclipse-temurin:17-jre
WORKDIR /app
ARG JAR=target/*.jar
COPY --from=build /app/${JAR} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
