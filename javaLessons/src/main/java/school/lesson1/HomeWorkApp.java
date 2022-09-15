package school.lesson1;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int min = 1;
        int max = 1000;
        int a = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Random a: " + a);
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Random b: " + b);
        int c = a + b;
        if (c >= 0) {
            System.out.println("The sum is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }

    public static void printColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Input value is: ");
        int value = sc.nextInt();
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = -7;
        int b = 231;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}