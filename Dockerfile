FROM bellsoft/liberica-openjdk-alpine-musl:11

ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'

COPY target/restaurant_collection-0.0.1-SNAPSHOT.jar /restaurant_collection.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/restaurant_collection.jar"]