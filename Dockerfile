FROM openjdk:17

COPY target/demo-app-8.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java","-jar","demo-app-8.jar"]
