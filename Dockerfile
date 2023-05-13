FROM openjdk:8
WORKDIR /usr/app
COPY ./target/*.jar ./
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]