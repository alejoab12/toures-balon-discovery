FROM openjdk:15-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","/app.jar"]
