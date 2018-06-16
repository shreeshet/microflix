FROM java:8-jre

ADD ./target/userservice-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/userservice-0.0.1-SNAPSHOT.jar"]


EXPOSE 8080
