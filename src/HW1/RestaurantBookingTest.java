package HW1;

public class RestaurantBookingTest {
    public static void main(String[] args) {
        Journal.addNewBooking("John", 1234567890, 4, "2024-02-26 / 18.00");
    }

    public static void printTableAvailability(int numberOfPeople) {
        boolean isTableAvailable = checkTableAvailability(numberOfPeople);

        if (isTableAvailable) {
            System.out.println("Table is available!");
        } else {
            System.out.println("Unfortunately, there are no available tables for " + numberOfPeople + " people.");
        }
    }

    public static boolean checkTableAvailability(int numberOfPeople) {
        // Здесь можна вставити логіку перевірки доступних столиків в ресторані
        // Наприклад, перевіряти наявність вільних столиків в базі даних
        // У цьому прикладі просто перевіряємо, чи є столик для вказаної кількості осіб
        return numberOfPeople <= 4; // Припускаємо, що доступні столики розраховані на до 4 осіб
    }
}
