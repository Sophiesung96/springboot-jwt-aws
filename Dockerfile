FROM openjdk:17-alpine
LABEL authors="sophie"
EXPOSE 8080
WORKDIR /app
COPY ./target/springboot-jwt-aws.jar springboot-jwt-aws.jar
ENTRYPOINT ["java", "-jar","springboot-jwt-aws.jar"]