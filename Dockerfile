FROM adoptopenjdk/openjdk8 AS builder
COPY gradlew gradlew
COPY gradle gradle
COPY build.gradle build.gradle
COPY settings.gradle settings.gradle
COPY src src
RUN chmod +x ./gradlew
RUN ./gradlew clean
RUN ./gradlew bootWar

FROM openjdk:8-jre-slim
COPY --from=builder build/libs/*.war app.war

ENTRYPOINT ["java", "-jar", "/app.war"]
