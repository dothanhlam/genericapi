FROM openjdk:8-jdk-alpine
COPY ./target/genericapi-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch genericapi-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","genericapi-0.0.1-SNAPSHOT.jar"]  