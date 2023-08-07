# Microservices Project

This project consists of multiple microservices, each running in a separate Docker container. 

The microservices are:
1. API Gateway
2. Concern Service
3. User Service
4. Service Registry (Eureka)

## Prerequisites

Before running the project, ensure you have the following software installed on your system:

- Docker
- Java Development Kit (JDK) 8

## Getting Started

Follow the steps below to set up and run the microservices project:

1. Clone the repository:
   git clone https://github.com/abhihm19/Micro-services-biginner-project.git

2. Build the microservices:
    Command to build the microservices

3. Start the services:
    Command to start the services

This command will start the API Gateway, Concern Service, User Service, and Service Registry containers in detached mode.

## Access the services:

- API Gateway: http://localhost:9191
- Concern Service: http://localhost:8081
- User Service: http://localhost:8082
- Service Registry (Eureka): http://localhost:8761

The API Gateway acts as the entry point for the microservices and forwards requests to the corresponding services based on the URL path.

## Service Endpoints

Each microservice exposes its own set of endpoints. Refer to the individual microservices' documentation for more details on their endpoints and functionality.

- API Gateway Endpoints:
  - /api/v1/concerns/**: Forwards requests to the Concern Service.
  - /api/v1/users/**: Forwards requests to the User Service.

- Concern Service Endpoints:
  - /api/v1/concerns: GET all concerns.
  - /api/v1/concerns/{id}: GET a concern by ID.

- User Service Endpoints:
  - /api/v1/users: GET all users.
  - /api/v1/users/{id}: GET a user by ID.

## Service Discovery

The microservices use Eureka (Service Registry) for service discovery and registration. Each service registers itself with the Service Registry, and the API Gateway queries the registry to discover the available services.

## Docker Containers

Each microservice runs in its own Docker container. Docker Compose is used to manage the container orchestration.
