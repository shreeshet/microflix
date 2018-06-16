FROM java:8-jre

ADD ./target/movieservice-1.0-SNAPSHOT.jar /app/app.jar
CMD ["java", "-Xmx200m", "-jar", "/app/app.jar"]


EXPOSE 8080
