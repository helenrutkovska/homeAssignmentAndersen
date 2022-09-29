package school.lesson5.Task1SwapElements;

import java.util.Arrays;

public class SwapArrayElementsOption1 {
    //changing elements of an array using a variable
    public static final <T> void swap(T[] arr, int i, int j) {
        T extra = arr[i];
        arr[i] = arr[j];
        arr[j] = extra;
    }

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "June", "May", "July"};
        Integer[] numbers = {1, 5, 8, 9, 555};

        swap(months, 3, 4);
        swap(numbers, 0, 4);
        System.out.println(Arrays.asList(months));
        System.out.println(Arrays.asList(numbers));
    }
}
