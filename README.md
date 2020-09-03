# Sonarqube - Example

Example of [Sonarqube](https://www.sonarqube.org/) usage with example java project.

Used [Docker](https://www.docker.com/) to containerize environment.  
[PostgreSQL](https://www.postgresql.org/) was used to store sonarqube data

## Sonarqube Example Service
* I created a class with some bad code, so that sonarqube could generate some warnings

## How to run the environment?

### Before you start
* Make sure you have `Docker`, `docker-compose`, `maven` and `Java 11` installed.

[Docker CE INSTALLATION](https://docs.docker.com/install/linux/docker-ce/ubuntu/)  
[Docker Compose INSTALLATION](https://docs.docker.com/compose/install/#prerequisites)  
[Maven INSTALLATION](https://maven.apache.org/install.html)  
[Java 11 INSTALLATION](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)  

### Start the environment
1. Run sonarqube and postgres:
    `docker-compose up`
2. Wait for sonarqube to fully start
3. Run sonarqube analysis (in sonarqube-example-service directory):  
    `mvn sonar:sonar -Dsonar.host.url=http://localhost:9000`
### Important endpoints:
* http://localhost:9000 - Sonarqube panel

![sonarqube](https://user-images.githubusercontent.com/15820051/89338632-72d62f80-d662-11ea-82c6-43b73e5d3b56.png)
