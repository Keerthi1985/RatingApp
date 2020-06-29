FROM openjdk:8-jdk-alpine
WORKDIR /demo
COPY Ratingdemo-0.0.1-SNAPSHOT.jar ./demo/rating.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","./demo/rating.jar"]
