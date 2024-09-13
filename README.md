# HotelTrivago - hotel Management System

A Java-based hotel management system designed to simulate hotel operations such as room booking, guest management, check-ins, check-outs, and financial transactions through bank accounts.

## Table of Contents
- [Project Description](#project-description)
- [Features](#features)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [How to Run the Project](#how-to-run-the-project)
- [Future Improvements](#future-improvements)

## Project Description
The Hotel Management System is a simulation tool that allows users to check in and check out of a hotel, ensuring proper management of guests, rooms, and financial transactions. It handles conditions such as room availability, guest identity, and bank balance validation for successful bookings.

This project serves as an exercise in mastering object-oriented programming (OOP) principles such as encapsulation, inheritance, polymorphism, and abstraction.

### Key Concepts Covered:
- Object-oriented programming
- Composition and delegation patterns
- Financial management through a separate Bank class
- Use of enums to define different room types (Single, Double, Suite)

## Features
- **Room Management**: Add and manage hotel rooms, including room availability and type.
- **Guest Management**: Manage guest profiles, including name, contact number, and room preferences.
- **Check-In/Check-Out System**: Check guests in and out of rooms, enforcing conditions such as availability and sufficient funds.
- **Financial Transactions**: Manage deposits, withdrawals, and payments through a Bank class.
- **Extras**: Option to add additional services (extras) for rooms.

## Project Structure
/src │ ├── Bank.java ├── Extra.java ├── Guest.java ├── Hotel.java ├── Profile.java ├── RoomType.java └── Rooms.java

Each class has a specific responsibility:
- **Bank**: Handles all financial transactions, ensuring guests have sufficient funds to check in or pay for services.
- **Extra**: Represents additional services or amenities that can be added to a room.
- **Guest**: Manages guest details like profile, room preference, check-in/check-out status, and financial interactions.
- **Hotel**: Manages hotel operations, including room availability, guest check-ins, and check-outs.
- **Profile**: Stores and manages guest-specific information such as name and contact details.
- **RoomType**: Defines different room types using enums with associated attributes like price and capacity.
- **Rooms**: Manages the room details and availability status for booking purposes.

### Languages
- **Java**

### Frameworks and Libraries
- **OOP Principles**: Encapsulation, Inheritance, Polymorphism, Abstraction
- **Enums**: Used for defining room types (Single, Double, Suite)
- **Collections**: ArrayLists to manage lists of guests and rooms

### Tools
- **Git**: Version control system used for tracking changes.


## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/CatP98/HotelTrivago/

