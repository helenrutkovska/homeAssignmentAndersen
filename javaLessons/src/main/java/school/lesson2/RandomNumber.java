package school.lesson2;

public class RandomNumber {
    private static int min = -100;
    private static int max = 100;

    public static Integer getRandomNumber() {
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        return randomNumber;
    }
}
