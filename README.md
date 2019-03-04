# Create a Spring web service client with Maven

A Java project that demonstrates how to create Spring web service client with Maven.

Key features:

* Contract-first.
* Spring-WS API 3.0.6.
* Marshal SOAP body with JAXB. 
* XML schema compiled to Java with the jaxb2-maven-plugin.
* Integration test with SoapUI mock service.

## Website

[https://sorenpoulsen.com/create-a-spring-web-service-client-with-maven](https://sorenpoulsen.com/create-a-spring-web-service-client-with-maven)

## Prerequisites

Maven 3.5.0 installed and its /bin folder on PATH.  
JDK 1.8 installed and JAVA_HOME set to the root folder of the JDK.

## Build and run test
```
git clone https://github.com/SorenPoulsen/spring-web-service-client-with-maven.git
cd spring-web-service-client-with-maven
mvn clean test
```
