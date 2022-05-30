FROM openjdk:11
COPY build/libs/helloDocker-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/helloDocker-0.0.1-SNAPSHOT.jar"]