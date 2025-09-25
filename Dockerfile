FROM ubuntu:20.04
LABEL authors="DELL"

RUN apt-get update && apt-get install -y maven openjdk-17-jdk && rm -rf /var/lib/apt/lists/*

WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/tempconverter.jar"]