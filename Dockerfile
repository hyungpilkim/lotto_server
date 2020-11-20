FROM openjdk:8-jre-slim
COPY build/libs/*.war app.war

ENTRYPOINT ["java", "-jar", "/app.war"]
