package school.lesson2;

public class ArrayTasks {
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
        }
        System.out.print("\n");
    }

    public static void fillArray() {
        int[] arr100 = new int[100];
        for (int j = 0; j < arr100.length; j++) {
            arr100[j] = j + 1;
            System.out.print(arr100[j]);
        }
        System.out.print("\n");
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void fillDiagonal() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j || i == x - 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void fillArrayValueLength(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void moveElementsOfTheArray(int[] array, int position) {

        if (position > 0) {
            for (int i = 0; i < position; i++) {
                int n = array[array.length - 1];

                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }

                array[0] = n;
            }
        } else {
            for (int i = 0; i > position; i--) {
                int n = array[0];

                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }

                array[array.length - 1] = n;
            }
        }
    }
}
