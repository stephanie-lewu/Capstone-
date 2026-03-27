# 3RD Year Car Rental System
## ADP362S - Applications Development Practice 3
### Assignment 1

---

## Project Description
A car rental management system designed for managing vehicle bookings, customer rentals, and branch operations.
The system tracks available cars, handles customer bookings, processes payments, and manages insurance options
for rentals. It ensures efficient allocation of vehicles across different branches while maintaining accurate records of rentals and customer activity.

---

## Group Members

| Name | Student Number | Entity |
|------|---------------|--------|
| Stephanie Tola Oluwafemi Lewu (Team Lead) | 230211216 | Member |
| Tanatswa Mabhodha | 220637482 | Booking |
| Owen Jnr Makene | 223219665 | Payment |
| Thandeka Chantal Malande | 222857005 | Insurance |
| Malwandla Blessing Mahori | 230962963 | Car |
| Solomon Elias Machaule | 222359366 | Branch |

---

---

## Group Members Github Links
- Tanatswa Mabhodha - https://github.com/Tanatswa-Mabhodha-22/Capstone-.git
- Thandeka Chantal Malande - https://github.com/ThandekaChantal
- Stephanie Lewu - https://github.com/stephanie-lewu/Capstone-
- Malwandla Blessing Mahori - https://github.com/MalBl3ssing/Capstone-.git
- Owen Jnr Makene **(Contributer)** - https://github.com/stephanie-lewu/Capstone-.git
- Solomon Elias Machaule - https://github.com/solomon2608/Capstone-.git

## How The System Works
- A **Member** registers on the system with their personal details
- The member browses available **Cars** at a **Branch**
- The member creates a **Booking** by selecting a car, start date and end date
- An **Insurance** policy is attached to the booking
- A **Payment** is processed for the booking
- The total cost is calculated based on the car's daily rate and rental duration

---

## Project Structure

src/
└── main/
    └── java/
        └── za/ac/cput/
            ├── domain/       # Entity classes
            ├── factory/      # Factory classes
            └── repository/   # Repository interfaces and implementations
└── test/
    └── java/
        └── za/ac/cput/
            ├── factory/      # Factory test classes
            └── repository/   # Repository test classes


---

## Package Descriptions

### Domain Package
The domain package contains the entity classes of the system.
Each entity represents a real world object in the Car Rental System
such as Booking, Car, Member, Payment, Insurance and Branch.
The entities are built using the Builder Pattern which allows
objects to be created step by step in a controlled way.

### Factory Package
The factory package contains the factory classes for each entity.
A factory class is responsible for creating instances of an entity.
It centralizes the creation of objects so that the rest of the
system does not need to worry about how objects are created.
This follows the Domain Driven Design (DDD) principle of factories.

### Repository Package
The repository package contains the interfaces and implementation
classes for storing and retrieving entities.
Each repository provides the basic CRUD operations which are
Create, Read, Update and Delete.
This follows the Domain Driven Design (DDD) principle of repositories
and ensures the system codes to abstraction not concretion.

### Factory Test Package
The factory test package contains the test classes for each factory.
These tests verify that the factory classes are creating objects
correctly. This follows the Test Driven Development (TDD) approach
where tests are written to prove the code works as expected.

### Repository Test Package
The repository test package contains the test classes for each
repository. These tests verify that the CRUD operations are working
correctly for each entity. This ensures the repository classes
are functioning as expected before the code is merged.


## Entities 

- **Car** - Vehicles available for rental
- **Member** - Customers who rent cars
- **Booking** - Records of car rentals
- **Branch** - Locations managing car inventory
- **Payment** - Transactions for bookings
- **Insurance** - Optional coverage for rentals

---

  ## Group Members
- **Leader** - Stephanie Tola Oluwafemi Lewu 230211216 - Member Entity
- **Member 2** - Tanatswa Mabhodha 220637482 - Booking Entity
- **Member 3** - Owen Jnr Makene 223219665 - Payment Entity
- **Member 4** - Thandeka Chantal Malande 222857005 - Insurance Entity
- **Member 5** - Malwandla Blessing Mahori 230962963 - Car Entity
- **Member 6** - Solomon Elias Machaule 222359366 - Branch Entity

---

## Contributing Guidelines
### Pull Request Process
- Create a branch using your student number
- Implement your assigned feature with tests (TDD)
- Ensure all tests pass
- Update documentation where necessary
- Create a Pull Request to the main branch
- Request review from the team leader
- Address any review comments

---

### Merge after approval

#### Code Review Checklist
- Follows Builder Pattern
- Includes TDD tests
- Correct package structure (domain, factory, repository)
- Author comments included in code
- No merge conflicts
- All tests passing

  

## Technologies Used
- Java
- Maven
- JUnit 5
- IntelliJ IDEA
- GitHub

---


## CAR RENTAL UML DIAGRAM


<img width="2614" height="1402" alt="Flowchart (2)" src="https://github.com/user-attachments/assets/4c3f05e1-7236-4252-9c34-ca86b9150977" />
