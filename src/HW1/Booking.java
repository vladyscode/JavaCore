package HW1;

import java.time.LocalDateTime;
import java.util.UUID;

public class Booking {
    private static int counterForID = 0;
    private String name;
    private long phoneNumber;
    private int numberOfPeople;
    private String dateForBooking;
    private LocalDateTime bookingTime;
    private int ID;


    public Booking(String name, long phoneNumber, int numberOfPeople, String dateForBooking) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.numberOfPeople = numberOfPeople;
        this.dateForBooking = dateForBooking;
        this.bookingTime = LocalDateTime.now();
        this.ID = counterForID++;
    }

    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getDateForBooking() {
        return dateForBooking;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public int getID() {
        return ID;
    }

    public void printBookingInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Date for booking: " + dateForBooking);
        System.out.println("Booking time: " + bookingTime);
        System.out.println("ID: " + ID);
    }
}
