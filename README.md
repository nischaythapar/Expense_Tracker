# Expense Tracker

A **simple Expense Tracker application** built with **Spring Boot**, **MongoDB**, and **Mongock** for database migrations.  
This application allows users to store and manage expenses in different categories.

---

## Features

- Track expenses with the following categories:
  - `ENTERTAINMENT`
  - `GROCERIES`
  - `RESTAURANT`
  - `UTILITIES`
  - `MISC`
- Automatically seed the database with sample expenses on startup using **Mongock migrations**.
- REST API endpoints for CRUD operations on expenses (to be implemented if needed).
- Built with Spring Boot 3 and MongoDB 6+, ensuring modern compatibility.

---

## Technologies Used

- **Spring Boot 3.3.5** – for REST API and application configuration  
- **Spring Data MongoDB** – for MongoDB integration  
- **Mongock 5.5.1** – for database migrations  
- **Java 17** – programming language  
- **Maven** – project management and build tool  
- **MongoDB** – database to store expenses  

---

## Getting Started

### Prerequisites

- Java 17 or above  
- Maven 3.8+  
- MongoDB 6+ installed and running  

---

### Setup

1. **Clone the repository**

```bash
git clone https://github.com/yourusername/expense-tracker.git
cd expense-tracker

## Configure MongoDB Connection

Update `application.properties` or `application.yml` with your MongoDB settings:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/expense_tracker_db


Build the Project
mvn clean install

Run the Application
mvn spring-boot:run


On startup, Mongock will automatically apply migrations and seed the database with sample expenses.

Project Structure
src/main/java
 └─ com.programming.learner
     ├─ config
     │    └─ MongockConfig.java         # Mongock migration configuration
     ├─ migrations
     │    └─ DatabaseChangeLog.java     # Database seed using @ChangeLog
     ├─ model
     │    ├─ Expense.java               # Expense entity
     │    └─ ExpenseCategory.java      # Enum for expense categories
     └─ repository
          └─ ExpenseRepository.java     # MongoDB repository for Expense

Example Expenses Seeded
Expense Name	Category	Amount
Movie Night	ENTERTAINMENT	15.50
Weekly Groceries	GROCERIES	120.75
Dinner at Olive Garden	RESTAURANT	45.20
Electricity Bill	UTILITIES	60.00
Random Shopping	MISC	25.00

Additional sample expenses are also seeded for testing purposes.

Future Improvements

Add REST endpoints for CRUD operations on expenses.

Add authentication and user management.

Add filtering, sorting, and reporting for expenses.

Create a frontend dashboard for visualizing expenses.

License

This project is licensed under the MIT License.


---

✅ **Notes:**

1. All commands are inside ```bash``` or ```properties``` blocks for proper formatting.  
2. Tables use Markdown pipes `|` so GitHub renders them nicely.  
3. Headings (`##`) structure the sections clearly.  
4. Quotes (`>`) highlight notes or extra info.  

---

If you want, I can also **add a “Usage Examples” section with sample REST API curl commands** for interacting with expenses — so your README will be fully practical for developers.  

Do you want me to add that next?
