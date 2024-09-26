FROM adoptopenjdk/openjdk19:alpine-jre

EXPOSE 7777

COPY build/libs/conditionalApp-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java","-jar","/myapp.jar"]