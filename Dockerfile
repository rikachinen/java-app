FROM maven:3.8.4-jdk-8 as builder
WORKDIR /usr/src
COPY . /usr/src/
RUN mvn -B package
FROM openjdk:8u181-jdk-alpine
# RUN addgroup -S appgroup && adduser -S appuser -G appgroup
# USER appuser
VOLUME .:/usr/src
EXPOSE 8080
COPY --from=builder /usr/src/target/demo-0.0.1-SNAPSHOT.jar /
ENV CLASSPATH /demo-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/demo-0.0.1-SNAPSHOT.jar"]