# 3RD Year Car Rental System
## ADP362S - Applications Development Practice 3
### Assignment 1

---

## Project Description
This project is a Car Rental System built using Java and Maven.
The system is developed using Domain Driven Design (DDD) principles
including Entities, Factories, and Repositories.
Test Driven Development (TDD) is applied throughout the project.

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

## Entities Implemented
- **Member** - Stephanie Tola Oluwafemi Lewu (230211216)
- **Booking** - Tanatswa Mabhodha (220637482)
- **Payment** - Owen Jnr Makene (223219665)
- **Insurance** - Thandeka Chantal Malande (222857005)
- **Car** - Malwandla Blessing Mahori (230962963)
- **Branch** - Solomon Elias Machaule (222359366)

---

## Technologies Used
- Java
- Maven
- JUnit 5
- IntelliJ IDEA
- GitHub

---


## CAR RENTAL UML DIAGRAM


<img width="2614" height="1402" alt="Flowchart (2)" src="https://github.com/user-attachments/assets/4c3f05e1-7236-4252-9c34-ca86b9150977" />
