# Bus Ticket Reservation System

## Project Overview

The Bus Ticket Reservation System is a Java-based application designed to manage bus reservations efficiently. It utilizes Object-Oriented Programming (OOP) principles and Java collections to simulate the booking and registration processes. This project is split into three main components, each encapsulated in separate Java files: Bus, Booking, and Registration.

## Features

- **Bus Management**: Define bus routes, timings, seat availability, and other essential details.
- **Ticket Booking**: Allow users to book tickets, choose their preferred seats, and view booking confirmations.
- **User Registration**: Manage user details, ensuring secure and personalized access to the reservation system.

## Project Structure

### 1. Bus.java

- Represents bus entities with attributes like bus ID, route, capacity, and availability.
- Methods to retrieve and update bus information.
- Supports searching for buses by route or availability.

### 2. Booking.java

- Handles the booking process, including seat selection and confirmation.
- Maintains a list of all bookings and allows for easy retrieval and cancellation.
- Integrates with `Bus.java` to check availability and update seat status.

### 3. Registration.java

- Manages user registration and authentication.
- Stores user details such as name, contact information, and booking history.
- Provides methods for updating user information and validating credentials.

## Technology Stack

- **Language**: Java
- **Libraries**: Utilizes Java Collections Framework for efficient data management.

## How to Run

1. Clone the repository from GitHub.
2. Compile the Java files using a Java compiler (e.g., `javac`).
3. Run the application using the Java runtime environment (e.g., `java`).

## Future Enhancements

- Implement a graphical user interface (GUI) for better user experience.
- Add payment processing functionality.
- Enhance the search and filtering capabilities for buses and bookings.

## Contributions

Contributions are welcome! Feel free to open issues or submit pull requests for new features, bug fixes, or enhancements.
