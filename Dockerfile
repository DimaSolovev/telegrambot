FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=javarush_dimas_bot
ENV BOT_TOKEN=2001793147:AAFALGyJmVQB9_NGr4PGxsxGKlHbt2icqOQ
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]