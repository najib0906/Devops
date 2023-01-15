FROM openjdk:11-alpine

# set working directory
WORKDIR /src

# copy the jar file
COPY target/*.jar app.jar

EXPOSE 8080


# run command
CMD ["java", "-jar", "app.jar"]
