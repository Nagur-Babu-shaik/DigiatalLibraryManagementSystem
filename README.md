# Book Management System

## Overview
This is a Spring Boot-based Book Management System that provides RESTful APIs for managing books in a MySQL database. It allows users to add, update, delete, search, and view books efficiently.

## Features
- Add a new book
- View all books
- Search for a book by ID or title
- Update book details
- Delete a book
- Exit the system

## Technologies Used
- Java (Spring Boot)
- Spring Data JPA
- MySQL Database
- Hibernate
- RESTful API

## Prerequisites
Ensure the following are installed:
- Java 17 or later
- Spring Boot 3.0+
- MySQL Database
- Maven

## Installation & Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/BookManagementSystem.git
   cd BookManagementSystem
   ```
2. Configure the database:
   - Open `application.properties` and update MySQL configurations:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```
3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## API Endpoints
| Method  | Endpoint           | Description             |
|---------|-------------------|-------------------------|
| POST    | `/books/add`       | Add a new book          |
| GET     | `/books/view`      | View all books          |
| GET     | `/books/search`    | Search by ID or title   |
| PUT     | `/books/update/{id}` | Update book details |
| DELETE  | `/books/delete/{id}` | Delete a book      |
| POST    | `/books/exit`      | Exit the system        |

## Running Tests
Run test cases using:
```bash
mvn test
```

## License
This project is licensed under the MIT License.

## Author
Shaik Nagur Babu
-(https://github.com/Nagur-Babu-Shaik)

