
FROM openjdk:17.0.2-oracle

VOLUME /tmp

ADD target/stock-api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT exec java -jar app.jar