FROM openjdk:8
EXPOSE 8080
ADD target/customer-service.jar customer-service.jar
ENTRYPOINT ["java","-jar","/customer-service.jar"]