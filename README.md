# Registration Application
This project is a sample application designed for a Software Developer Intern assessment. It demonstrates CRUD (Create, Read, Update, Delete) operations using Java (Spring Boot) for the backend and HTML/CSS for the frontend.

## Features
Create, view, update, and delete user registrations.
Stores user information such as ID, Name, Email, Date of Birth, Phone Number, and Registration Date.
Uses MySQL as the database.

# Steps to setup the project
## Step 1: Design the SQL Table
### Create the Registration table in MySQL:
<pre>
CREATE TABLE Registration (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    DateOfBirth DATE NOT NULL,
    PhoneNumber VARCHAR(15),
    RegistrationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
</pre>

## Step 2: Spring Boot Project Setup
### Backend Folder Structure
<pre>
backend/
├── src/main/java/com/example/registration
│   ├── RegistrationApplication.java
│   ├── controller/RegistrationController.java
│   ├── model/Registration.java
│   ├── repository/RegistrationRepository.java
│   └── service/RegistrationService.java
└── src/main/resources
    ├── application.properties
    └── data.sql
</pre>

## Step 3: Frontend Implementation
### Frontend Folder Structure
<pre>
frontend/
├── index.html
├── style.css
└── script.js
</pre>


# Steps to Run the Project
## Prerequisites
<ul>
<li>Java JDK 17 or higher</li>
<li>Apache Maven</li>
<li>MySQL Server</li>
<li>A modern web browser (e.g., Chrome, Edge, or Firefox)</li>
</ul>

### Backend
1. Navigate to the `backend` directory.
2. Run `mvn spring-boot:run`.
3. The backend server will start at `http://localhost:8080`.

### Frontend
1. Navigate to the `frontend` directory.
2. Open `index.html` in a browser.
3. Use the form to create registrations and view the list.

### Database
1. Set up a MySQL database.
2. Update the connection details in `application.properties`.
3. The table will be auto-created.
