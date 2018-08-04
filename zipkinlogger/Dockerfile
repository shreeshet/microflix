FROM java:8-jre
ADD ./zipkin.jar /app/
CMD ["RABBIT_ADDRESSES=192.168.1.3 java", "-Xmx200m", "-jar", "/app/zipkin.jar","--zipkin.collector.rabbitmq.addresses=rabbitmq"]

EXPOSE 9411
