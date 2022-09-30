package school.lesson6;

import static school.lesson6.ArrayDetails.arrayProcessing;

public class ArrayExceptionApp {
    public static void main(String[] args) {
        String[][] biggerArray = new String[7][3];
        String[][] incorrectArray = {{"1", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"},
                {"5", "5", "5", "5"}
        };
        String[][] correctArray = {{"1", "1", "1", "1"},
                {"22", "22", "22", "22"},
                {"333", "333", "333", "333"},
                {"4444", "4444", "4444", "4444"}
        };

        try {
            System.out.println("The sum of elements in a bigger array is: " + arrayProcessing(biggerArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("The sum of elements in the incorrect array is: " + arrayProcessing(incorrectArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("The sum of elements in the correct array is: " + arrayProcessing(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
