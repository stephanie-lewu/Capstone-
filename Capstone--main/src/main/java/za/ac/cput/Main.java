package za.ac.cput;

import za.ac.cput.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(" CAR RENTAL SYSTEM ");

        //  1. CUSTOMER REGISTRATION
        Member member = new Member.Builder()
                .setMemberId("M001")
                .setName("Mal Samuels")
                .setLicenseNumber("LIC12345")
                .setPhoneNumber(0712345678)
                .setAccountStatus("Active")
                .build();

        System.out.println("Customer Registered: " + member.getName());

        // 2. CAR SELECTION 
        Car car = new Car.Builder()
                .setCarID("C001")
                .setMake("Toyota")
                .setModel("Corolla")
                .setYear(2022)
                .setDailyRate(500.0)
                .setStatus("Available")
                .setMileage(10000)
                .build();

        System.out.println("Car Selected: " + car.getMake() + " " + car.getModel());

        // 3. BOOKING CREATION 
        Booking booking = new Booking.Builder()
                .setBookingID("B001")
                .setMemberID(member.getMemberId())
                .setCarID(car.getCarID())
                .setStartDate("2026-03-27")
                .setEndDate("2026-03-30")
                .setTotalCost(1500.0)
                .build();

        System.out.println("Booking Created: " + booking.getBookingID());

        //  4. INSURANCE ADD-ON 
        Insurance insurance = new Insurance.Builder()
                .setInsuranceID("I001")
                .setBookingID(booking.getBookingID())
                .setType("Full Cover")
                .setDailyPremium(100.0)
                .build();

        double insuranceTotal = insurance.calculatePremiumTotal(3);
        System.out.println("Insurance Added: " + insurance.getType() + " | Total = R" + insuranceTotal);

        // 5. PAYMENT
        Payment payment = new Payment.Builder()
                .setPaymentID("P001")
                .setBookingID(booking.getBookingID())
                .setAmount(booking.getTotalCost() + insuranceTotal)
                .setPaymentDate(LocalDate.now())
                .setMethod("Card")
                .build();

        System.out.println(payment.generateInvoice());

        //  6. BRANCH INFO 
        Branch branch = new Branch.Builder()
                .setBranchID(1)
                .setBranchName("Cape Town Branch")
                .setAddress("123 Main Road")
                .setCity("Cape Town")
                .setManagerName("Mr Manager")
                .build();

        branch.listAvailableCarsAtBranch();

        // FINAL SUMMARY 
        System.out.println("\n RENTAL SUMMARY ");
        System.out.println("Customer: " + member.getName());
        System.out.println("Car: " + car.getMake() + " " + car.getModel());
        System.out.println("Booking ID: " + booking.getBookingID());
        System.out.println("Total Paid: R" + payment.getAmount());
    }
}
