FROM eclipse-temurin:17.0.12_7-jdk
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} ApiculturappServices-1.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/ApiculturappServices-1.jar"]