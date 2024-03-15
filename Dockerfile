FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
WORKDIR /opt/app
ADD ./target/VacationPayService.jar ./service.jar
CMD ["java", "-jar", "/opt/app/service.jar"]