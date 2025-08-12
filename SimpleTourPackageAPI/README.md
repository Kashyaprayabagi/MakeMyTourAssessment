# SimpleTourPackageAPI

This is a Spring Boot RESTful API project that manages tour packages. It implements create, retrieve (all and by ID) operations with proper validation and error handling using DTOs. The project uses PostgreSQL as its database.

## **Features**

  * Create a new tour package (POST /api/tours)

  * Get all tour packages (GET /api/tours)

  * Get tour package by ID (GET /api/tours/{id})

  * Validation on input fields using Jakarta Bean Validation

  * Custom exception handling with standardized HTTP status responses

  * DTO usage for clean API boundaries

  * Layered architecture (Controller → Service → Repository)

# Tech Stack
   1. Java 21

   2. Spring Boot 3.x

   3. Spring Data JPA

   4. PostgreSQL

   5. Maven

   6. Lombok

   7. Jakarta Bean Validation

# Setup Instructions

    Prerequisites
    Java 21
    Maven
    PostgreSQL installed and running
    Git

# Database Setup (PostgreSQL)

## Create a PostgreSQL database:
    CREATE DATABASE mapmytour;

    CREATE USER postgres WITH PASSWORD 'yourpassword';
    GRANT ALL PRIVILEGES ON DATABASE mapmytour TO postgres;
    Configure the Application

### Open src/main/resources/application.properties and update accordingly:
    
    spring.application.name=SimpleTourPackageAPI
    spring.datasource.url=jdbc:postgresql://localhost:5432/mapmytour
    spring.datasource.username=postgres
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    Run the Application

## Clone the repository:

    git clone https://github.com/Kashyaprayabagi/MakeMyTourAssessment
    cd SimpleTourPackageAPI
    Build the project

# mvn clean install

    Run:
    mvn spring-boot:run
    API Endpoints

# Create Tour Package

## POST /api/tours

### Request body example:

    {
    "id": 1,
    "image": "https://images.unsplash.com/photo-1598275277521-1885382d523a",
    "discountInPercentage": "17%",
    "title": "Himalayan Trek Adventure",
    "description": "14-day trek through the Himalayas",
    "duration": "14Days/13Nights",
    "actualPrice": "$1200",
    "discountedPrice": "$1000"
    }

    Response: 201 Created with the created package.

## Get All Tour Packages

    GET /api/tours
    Returns a list of all tour packages.
    Response: 200 OK

## Get Tour Package by ID
    
    GET /api/tours/{id}
    Returns the tour package with the provided ID.
    Response: 200 OK if found, or 404 Not Found if not found.

## Error Handling

    If input validation fails (e.g., empty required field), returns 400 Bad Request with details.
    
    If no tour packages are found, returns 404 Not Found with an error message.
    
    If a package with the given ID already exists on create, returns 409 Conflict.

## Contact

    For any questions or issues, contact rayabagikashyap@gmail.com
    Name: R Srikrishna Kashyap
    PhNo: +91 82478 63082