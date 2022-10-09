package school.lesson8.Task2_PhoneBook;

public class PhoneBookApp {
    public static void main(String[] args) {

        PhoneBook newPhoneBook = new PhoneBook();
        newPhoneBook.add("Brown", "+48550660770");
        newPhoneBook.add("White", "+48110220330");
        newPhoneBook.add("Musk", "+48220330440");
        newPhoneBook.add("Kennedy", "+48330770990");
        newPhoneBook.add("Wilson", "+48660880440");
        newPhoneBook.add("Musk", "+48220357440");
        newPhoneBook.add("Kennedy", "+48330770983");
        newPhoneBook.add("Wilson", "+48660811440");

        newPhoneBook.get("Brown");
        newPhoneBook.get("Wilson");
        newPhoneBook.get("Kennedy");
    }
}
