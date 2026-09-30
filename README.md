# Hotel Management System

A full-stack hotel management system built with **Java 21, Spring Boot, Oracle, HTML, CSS, and JavaScript**.

## Features
- User registration and login
- JWT-based authentication support
- Room listing and availability filtering
- Room booking with check-in/check-out dates
- Booking history
- Admin dashboard and room management
- Responsive hotel-themed frontend

## Project Structure
- `backend/` — Spring Boot REST API
- `frontend/` — HTML, CSS, and JavaScript client

## Tech Stack
**Backend:** Java 21, Spring Boot, Spring Security, Spring Data JPA, Maven  
**Database:** Oracle Database  
**Frontend:** HTML5, CSS3, JavaScript

## Local Setup

### Backend
1. Install Java 21, Maven, and Oracle Database.
2. Create the required Oracle schema/user.
3. Configure the database values through environment variables or a local `application.properties`.
4. Run:
```bash
cd backend
mvn spring-boot:run
```

### Frontend
Open `frontend/index.html` with a local web server and make sure the API URL in `frontend/app.js` points to your running backend.

## Security Note
Database credentials are intentionally not stored in this repository. Configure them locally or through environment variables before running the backend.
