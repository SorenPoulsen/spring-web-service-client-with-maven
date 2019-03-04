# Create a Spring web service client with Maven

A Java project that demonstrates how to create Spring web service client with Maven.

The web service client is built "contract-first" from a WSDL file and a number of XSD files. It uses the Spring-WS API and marshals and unmarshals the SOAP body content with JAXB. The JAXB annotated Java classes are compiled from schema using the jaxb2-maven-plugin.

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
