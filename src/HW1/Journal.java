package HW1;

public class Journal {
    private static int journalSize = 0;
    private static final int MAX_JOURNAL_SIZE = 100;
    private static Booking[] journal = new Booking[MAX_JOURNAL_SIZE];

    public static void addNewBooking(String name, long phoneNumber, int numberOfPeople, String dateForBooking) {

        if (journalSize < MAX_JOURNAL_SIZE) {
            journal[journalSize] = new Booking(name, phoneNumber, numberOfPeople, dateForBooking);
            journalSize++;
        } else {
            System.out.println("Journal is full");
        }
    }

    public static void printJournal() {
        for (int i = 0; i < journalSize; i++) {
            journal[i].printBookingInfo();
        }
    }
}
