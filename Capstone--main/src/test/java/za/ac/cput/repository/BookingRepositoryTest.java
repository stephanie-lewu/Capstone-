package za.ac.cput.repository;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookingRepositoryTest {

    private IBooking repository = IBooking.getRepository();

@Test
    public void create () {
        Booking booking = BookingFactory.buildBooking(
                "B001",
                "M001",
                "C001",
                "2026/03/15",
                "2026/03/20",
                1200.00

        );
        Booking created = repository.create(booking);
        assertNotNull(created);

        System.out.println(created);
    }
@Test
    public void read(){
        Booking booking = BookingFactory.buildBooking(
                "B002",
                "M002",
                "C002",
                "2026/04/01",
                "2026/04/04",
                15000.00
        );
        repository.create(booking);

        Booking readBooking = repository.read("B002");
        assertNotNull(readBooking);
        System.out.println(readBooking);
    }

    //UPDATE
     @Test
    public void update(){
    Booking booking = BookingFactory.buildBooking(
            "B003",
            "M003",
            "C003",
            "2026/03/25",
            "2026/03/27",
            1300.00
    );
     repository.create(booking);
      Booking updateBooking = new Booking.Builder()
              .setBookingID("B003")
              .setMemberID("M003")
              .setCarID("C003")
              .setStartDate("2026/03/25")
              .setEndDate("2026/03/27")
              .setTotalCost(1300.00)
              .build();

      Booking updated = repository.update(updateBooking);
      assertNotNull(updated);
        System.out.println("Update:" +updated);
    }
        //DELETE
    @Test
    public void delete(){
    Booking booking = BookingFactory.buildBooking(
            "B004",
            "M004",
            "C004",
            "2026/03/22",
            "2026/03/24",
            1800.00
    );
    repository.create(booking);
    boolean deleted = repository.delete("B004");

    assertTrue(deleted);
        System.out.println("The Booking has been successfully deleted. ");

    }



}
