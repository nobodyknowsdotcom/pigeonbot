FROM bellsoft/liberica-openjdk-alpine:21

COPY . /app
WORKDIR /app

RUN ./gradlew clean build
EXPOSE 8080
ENTRYPOINT java -jar /app/build/libs/pigeonbot.jar -Xms256m -Xmx256m
