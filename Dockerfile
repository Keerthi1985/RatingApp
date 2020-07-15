FROM openjdk:8-jdk-alpine
WORKDIR /demo
COPY RatingDemo.jar ./demo/rating.jar
COPY InfyBuddy.jar ./demo/InfyBuddy.jar
EXPOSE 8082
EXPOSE 9300
ENTRYPOINT ["java","-javaagent:./demo/InfyBuddy.jar","-jar","./demo/rating.jar"]
