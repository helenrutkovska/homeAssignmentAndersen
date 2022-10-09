package school.lesson8.Task2_PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> personalContact = new ArrayList<>();
        if (this.phoneBook.containsKey(surname)) {
            if (this.phoneBook.get(surname).toString().contains(phoneNumber)) {
                System.out.println("The phone number \"" + phoneNumber + "\" for \""
                        + surname + "\" has already been added");
            } else {
                personalContact = this.phoneBook.get(surname);
                personalContact.add(phoneNumber);
                this.phoneBook.put(surname, personalContact);
            }
        } else {
            personalContact.add(phoneNumber);
            this.phoneBook.put(surname, personalContact);
        }
    }

    public void get(String surname) {
        if (this.phoneBook.containsKey(surname)) {
            System.out.println("Surname: " + surname + "\nContact.: " + this.phoneBook.get(surname).toString());
        } else {
            System.out.println("The contact number for " + surname + " doesn't exist.");
        }
    }
}
