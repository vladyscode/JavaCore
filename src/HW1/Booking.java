package HW1;

import java.time.LocalDateTime;

public class Booking {
    private String name;
    private long phoneNumber;
    private int numberOfPeople;
    private String dateForBooking;
    private LocalDateTime bookingTime;


    public Booking(String name, long phoneNumber, int numberOfPeople, String dateForBooking) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.numberOfPeople = numberOfPeople;
        this.dateForBooking = dateForBooking;
        this.bookingTime = LocalDateTime.now();
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

    public void printBookingInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Date for booking: " + dateForBooking);
        System.out.println("Booking time: " + bookingTime);
    }
}
