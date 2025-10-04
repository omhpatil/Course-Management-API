# Course Management API

A **Spring Boot** RESTful API for managing courses, built using **Spring Data JPA** and **MySQL**. This project allows basic CRUD operations for courses including creation, retrieval, update, and deletion.

## Features

* **Create Course:** Add a new course with title, description, price, category, and instructor.
* **Read Courses:**

  * Get a single course by ID
  * Get all courses
* **Update Course:** Update existing course details by ID
* **Delete Course:** Remove a course by ID
* **DTO & Entity Mapping:** Uses **DTOs** (`CourseRequest`, `CourseResponse`) to separate API layer from persistence layer.
* **Spring Data JPA:** Simplifies database operations
* **Lombok:** Reduces boilerplate code for getters, setters, constructors, and builders.

## Technologies Used

* Java 21
* Spring Boot 3.2.4
* Spring Data JPA
* MySQL
* Lombok
* Maven

## Project Structure

```
com.project
│
├─ controller
│   └─ CourseController.java  # REST API endpoints
│
├─ service
│   ├─ CourseService.java     # Service interface
│   └─ impl
│       └─ CourseServiceImpl.java  # Service implementation
│
├─ repository
│   └─ CourseRepository.java  # JPA repository
│
├─ dto
│   ├─ CourseRequest.java     # Request payload DTO
│   └─ CourseResponse.java    # Response payload DTO
│
└─ model
    └─ Course.java            # JPA Entity
```

## API Endpoints

| Method | Endpoint            | Description         |
| ------ | ------------------- | ------------------- |
| POST   | `/api/courses`      | Create a new course |
| GET    | `/api/courses`      | Get all courses     |
| GET    | `/api/courses/{id}` | Get course by ID    |
| PUT    | `/api/courses/{id}` | Update course by ID |
| DELETE | `/api/courses/{id}` | Delete course by ID |

## How to Run

1. Clone the repository
2. Configure MySQL database in `application.properties`
3. Build the project with Maven:

   ```bash
   mvn clean install
   ```
4. Run Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```
5. Test API endpoints using Postman or any API client.

## Example JSON Requests

**Create Course:**

```json
{
  "title": "Java Basics",
  "description": "Introduction to Java programming",
  "price": 499.99,
  "categoryId": 1,
  "instructorId": 2
}
```

**Response:**

```json
{
  "id": 1,
  "title": "Java Basics",
  "description": "Introduction to Java programming",
  "price": 499.99,
  "categoryId": 1,
  "instructorId": 2
}
```

**Update Course:**

```json
{
  "title": "Advanced Java",
  "description": "Deep dive into Java",
  "price": 699.99,
  "categoryId": 1,
  "instructorId": 2
}
```

**Response:**

```json
{
  "id": 1,
  "title": "Advanced Java",
  "description": "Deep dive into Java",
  "price": 699.99,
  "categoryId": 1,
  "instructorId": 2
}
```
