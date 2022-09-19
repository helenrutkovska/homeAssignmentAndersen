package school.lesson2;

import static school.lesson2.ArrayTasks.*;
import static school.lesson2.SimpleLogicTasks.*;

public class SecondLessonTasks {
    private static int[] arrays = {12, 15, 18, 21, 24, 27};
    private static String text = "Java is fantastic!";
    private static Integer times = 12;
    private static Integer year = 1665;
    private static Integer randomNumber = RandomNumber.getRandomNumber();

    public static void main(String[] args) {
        within10and20(3, 17);
        isPositiveOrNegative(randomNumber);
        isNegative(randomNumber);
        printWordNTimes(text, times);
        leapYear(year);
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        fillArrayValueLength(6, 2);
        moveElementsOfTheArray(arrays, -4);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}

