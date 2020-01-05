# gestion-absence
## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[Flyway](https://flywaydb.org/) - Version control for database
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[MySQL](https://www.mysql.com/) - Open-Source Relational Database Management System
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* 	[Thymeleaf](https://www.thymeleaf.org/) - Modern server-side Java template engine for both web and standalone environments.
* 	[Prometheus](https://prometheus.io/) - Monitoring system and time series database
* 	[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* 	[Swagger](https://swagger.io/) - Open-Source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.
## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `package com.login.login;
` class from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
### Actuator

To monitor and manage your application

|  URL |  Method |
|----------|--------------|
|`http://localhost:8080/welcome`  				| GET |
|`http://localhost:8080/edit-user`           | GET |
|`http://localhost:8080/noter-absence`    	| GET |
|`http://localhost:8080/modifier-absence`    | GET |
```
.
├── Spring Elements
├── src
│   └── main
│       └── java
│           ├── com.login.login
│           ├── com.login.login.controller
│           ├── com.login.login.model
│           ├── com.login.login.repository
│           └── com.login.login.services
│           
│           
│          
├── src
│   └── main
│       └── webapp
            └── resources
│              └── static
│                  │   ├── css
│                  │   │   └── bootstrap.min.css
│                  │   ├── fonts
│                  │   |
|                  |   └── js
│                  │   
│                  │   
│                  ├── templates
│                  │   └── view.html 
│                  ├── WEB-INF
│                  |   └── view
|                  |      └── welcome.jsp
                   └──
│                  
│                  
├── src
│   └── test
│       └── java
├── JRE System Library
├── Maven Dependencies
├── bin
├── logs
│   └── application.log
├── src
├── target
│   └──application-0.0.1-SNAPSHOT
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```
