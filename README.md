# swagger-microservices-sample
A consolidated Swagger service for a microservices-based system.

## Architecture
The system sample consists of the following modules:
- **api-gateway** - [Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/reference/html/) - based.
- **auth-client** - simple service mimicking authorization client, including login, refresh token, etc.
- **profiles** - simple service mimicking user profiles storage, including signup, edit profile functions.
- **swagger-service** - a service which consolidates all the swagger documentation.

The system can perform Service Discovery with Consul or Kubernetes native discovery.

## Usage
You can run the modules locally - starting a consul docker image, then running the modules:
 **mvn -pl module-name spring-boot:run**
 
 For a docker-compose option, a predefined "docker" profile is available, you just need to pass it as an env variable:
 **environment:
        - "SPRING_PROFILES_ACTIVE=docker"**
        
 For a **kubernetes** deployment, a predefined "kubernetes" profile is available, spring will autodetect and activate the profile once run in a k8s env.


## Swagger UI available at
http://localhost:9132/swagger-ui.html#/
