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
