# Used JAva 17 in Intellij s used openjdk 17 in my Docker
FROM openjdk:17-jdk-slim
# Set the working directory inside the container
WORKDIR /app
# Copy the Jar file from the target directory to the container at /app
COPY target/week3OpenFeign-0.0.1-SNAPSHOT.jar /app

# Make port 8080 available to the world outside this container
EXPOSE 8081

# Command to run the application
CMD ["java", "-jar", "week3OpenFeign-0.0.1-SNAPSHOT.jar"]