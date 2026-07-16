# Student Course Management System

A RESTful backend application built with Spring Boot that manages students, courses, and enrollments. It provides CRUD operations and demonstrates relational database management using Spring Data JPA and PostgreSQL.

## Features

- Student Management
  - Add Student
  - Get All Students
  - Get Student by ID
  - Update Student
  - Delete Student

- Course Management
  - Add Course
  - Get All Courses
  - Get Course by ID
  - Update Course
  - Delete Course

- Enrollment Management
  - Enroll a Student in a Course
  - Get Courses of a Student
  - Get Students Enrolled in a Course
  - Delete Enrollment

- Exception Handling
- RESTful API Design
- PostgreSQL Database Integration

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Postman

## Project Structure

```
src
├── controller
├── service
├── repository
├── entity
├── exception
├── dto (if used)
└── resources
```

## Database

Tables:
- Student
- Course
- Enrollment

Relationship:
- Student ↔ Enrollment ↔ Course
- Many-to-Many relationship implemented using Enrollment entity.

## API Endpoints

### Student APIs

| Method | Endpoint |
|---------|----------|
| GET | /students |
| GET | /students/{id} |
| POST | /students |
| PUT | /students/{id} |
| DELETE | /students/{id} |

### Course APIs

| Method | Endpoint |
|---------|----------|
| GET | /courses |
| GET | /courses/{id} |
| POST | /courses |
| PUT | /courses/{id} |
| DELETE | /courses/{id} |

### Enrollment APIs

| Method | Endpoint |
|---------|----------|
| POST | /enrollments |
| GET | /students/{id}/courses |
| GET | /courses/{id}/students |
| DELETE | /enrollments/{id} |

## Installation

1. Clone the repository

```bash
git clone https://github.com/yourusername/student-course-management.git
```

2. Open the project in Eclipse or IntelliJ.

3. Create a PostgreSQL database.

4. Configure `application.properties`:

```properties
spring.datasource.url=YOUR_DATABASE_URL
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

5. Run the project.

## Testing

Use Postman to test all REST APIs.


**Smruti Ranjan Sahoo**

GitHub: https://github.com/smruti2006
LinkedIn: [https://linkedin.com/in/yourprofile](https://www.linkedin.com/in/smruti06/)
