package hw1;

public class RestaurantBookingTest {
    public static void main(String[] args) {
        Journal.addNewBooking("John", 256327789, 4, "2024-02-26 / 18.00");
        Journal.addNewBooking("Vlad", 272722828, 4, "2024-02-26 / 18.00");
        Journal.addNewBooking("Liza", 788876859, 4, "2024-02-26 / 18.00");
        Journal.addNewBooking("Dima", 1234567893, 4, "2024-02-26 / 18.00");

        System.out.println();
        Journal.getAllInfo();

        System.out.println();
        Journal.deleteBooking(0);

        System.out.println();
        Journal.getAllInfo();
    }
}
