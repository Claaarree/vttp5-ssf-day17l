FROM eclipse-temurin:23-jdk

ARG APP_DIR=/app

WORKDIR ${APP_DIR}

COPY src src
COPY mvnw .
COPY mvnw.cmd .
COPY pom.xml .
COPY .mvn .mvn

RUN chmod a+x ./mvnw && ./mvnw package -Dmaven.test.skip=true

ENV SERVER-PORT=4000

EXPOSE ${SERVER-PORT}

ENTRYPOINT java -jar vttp5a-ssf-day17l-0.0.1-SNAPSHOT.jar 