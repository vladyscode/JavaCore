package hw1;

public class Journal {
    private static int JOURNAL_SIZE = 0;
    private static final int MAX_JOURNAL_SIZE = 100;
    private static Booking[] journal = new Booking[MAX_JOURNAL_SIZE];

    public static void addNewBooking(String name, long phoneNumber, int numberOfPeople, String dateForBooking) {
        if (JOURNAL_SIZE < MAX_JOURNAL_SIZE) {

            if (!checkTableAvailability(numberOfPeople, dateForBooking)) {
                System.out.println("Unfortunately, there are no available tables for " + numberOfPeople + " people.");
                return;
            } else {
                System.out.println("Table is available! We will add your booking to the journal, " + name + "!");
            }

            journal[JOURNAL_SIZE] = new Booking(name, phoneNumber, numberOfPeople, dateForBooking);
            JOURNAL_SIZE++;
        } else {
            System.out.println("Journal is full");
        }
    }

    public static void getAllInfo() {
        for (int i = 0; i < JOURNAL_SIZE; i++) {
            journal[i].printBookingInfo();
        }
    }

    public static boolean checkTableAvailability(int numberOfPeople, String dateForBooking) {
        int availableTables = 0;

        for (int i = 0; i < JOURNAL_SIZE; i++) {
            if (journal[i].getNumberOfPeople() == numberOfPeople && journal[i].getDateForBooking().equals(dateForBooking)) {
                availableTables++;
            }
        }

        return availableTables < 3; //assume that there are only 3 tables for each number of people at certain time
    }

    public static void deleteBooking(int ID) {
        for (int i = 0; i < JOURNAL_SIZE; i++) {
            if (journal[i].getId() == ID) {
                for (int j = i; j < JOURNAL_SIZE - 1; j++) {
                    journal[j] = journal[j + 1];
                }
                JOURNAL_SIZE--;
                break;
            }
        }
    }

    public static void printJournal() {
        for (int i = 0; i < JOURNAL_SIZE; i++) {
            System.out.println("Name: " + journal[i].getName());
            System.out.println("Phone number: " + journal[i].getPhoneNumber());
            System.out.println("Number of people: " + journal[i].getNumberOfPeople());
            System.out.println("Date for booking: " + journal[i].getDateForBooking());
            System.out.println("Booking time: " + journal[i].getBookingTime());
        }
    }
}
