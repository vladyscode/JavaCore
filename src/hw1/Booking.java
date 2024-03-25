package hw1;

import java.time.LocalDateTime;

public class Booking {
    private static int COUNTER_FOR_ID = 0;
    private String name;
    private long phoneNumber;
    private int numberOfPeople;
    private String dateForBooking;
    private LocalDateTime bookingTime;
    private int id;


    public Booking(String name, long phoneNumber, int numberOfPeople, String dateForBooking) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.numberOfPeople = numberOfPeople;
        this.dateForBooking = dateForBooking;
        this.bookingTime = LocalDateTime.now();
        this.id = COUNTER_FOR_ID++;
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

    public int getId() {
        return id;
    }

    public void printBookingInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Date for booking: " + dateForBooking);
        System.out.println("Booking time: " + bookingTime);
        System.out.println("ID: " + id);
    }
}
