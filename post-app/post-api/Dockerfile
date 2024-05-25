
FROM openjdk:17.0.2-oracle

VOLUME /tmp

# using network from host machine
#ENV DATABASE_HOST=host.docker.internal
#ENV DATABASE_PORT=3307

# using docker network: post-network
# post-app-mysql is container name of mysql container.
ENV DATABASE_HOST=post-app-db
ENV DATABASE_PORT=3306

ENV DATABASE_NAME=mysql
ENV DATABASE_USERNAME=root
ENV DATABASE_PASSWORD=root

ADD target/post-api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT exec java -jar app.jar