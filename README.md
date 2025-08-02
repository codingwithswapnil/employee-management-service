# Employee Management Service

## Overview
This is a Spring Boot microservice application for managing employee records. It provides a RESTful API to perform CRUD operations on employee data.

## Features
- Create, read, update, and delete employee records.
- Employee entity includes the following fields:
  - `id`: Unique identifier for the employee.
  - `name`: Name of the employee.
  - `department`: Department where the employee works.
  - `employeeId`: Unique employee ID.
  - `address`: Address of the employee.

## Technologies Used
- Java 24
- Spring Boot
- Spring Data JPA
- Swagger for API documentation

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd employee-management-service
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```

## API Documentation
API documentation is available through Swagger. Once the application is running, you can access the documentation at:
```
http://localhost:8080/swagger-ui/
```

## Usage
- To create a new employee, send a POST request to `/employees` with the employee details in the request body.
- To retrieve an employee, send a GET request to `/employees/{id}`.
- To update an employee, send a PUT request to `/employees/{id}` with the updated details.
- To delete an employee, send a DELETE request to `/employees/{id}`.

## License
This project is licensed under the MIT License.