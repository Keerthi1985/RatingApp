FROM openjdk:8-jdk-alpine
WORKDIR /demo
COPY RatingDemo.jar ./demo/rating.jar
COPY InfyBuddy.jar ./demo/InfyBuddy.jar
COPY opentelemetry-auto-all.jar ./demo/opentelemetry-auto-all.jar
EXPOSE 8082
EXPOSE 9300
ENTRYPOINT ["java","-javaagent:./demo/InfyBuddy.jar","-javaagent:./demo/opentelemetry-auto-all.jar","-Dota.exporter=jaeger","-Dota.exporter.jaeger.endpoint=jaeger-collector:14250","-Dota.exporter.jaeger.service.name=Rating","-jar","./demo/rating.jar"]
