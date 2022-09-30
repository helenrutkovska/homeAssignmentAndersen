package school.lesson6;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j) {
        super("Invalid value in: [" + i + "][" + j + "] ");
    }
}
