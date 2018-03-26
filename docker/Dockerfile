# Use an official java-8 as a parent image
FROM openjdk:8

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
ADD target/estore-0.0.1-SNAPSHOT.jar /app
# COPY . /usr/src/myapp

# Make port 8181 available to the world outside this container
EXPOSE 8181

# Set proxy server, replace host:port with values for your servers
ENV http_proxy host:port
ENV https_proxy host:port

# Run app.py when the container launches
CMD ["java", "-jar", "estore-0.0.1-SNAPSHOT.jar"]