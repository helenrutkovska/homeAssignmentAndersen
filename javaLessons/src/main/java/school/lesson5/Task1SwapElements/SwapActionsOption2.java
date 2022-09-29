package school.lesson5.Task1SwapElements;

import java.util.Arrays;

public class SwapActionsOption2 {

    public static class Action<T> {
        private T[] array;

        public Action(T... array) {
            this.array = array;
        }

        public T[] getArray() {
            return array;
        }

        public void swap(int a, int b) {
            T arr = getArray()[a];
            getArray()[a] = getArray()[b];
            getArray()[b] = arr;
            System.out.println(Arrays.toString(getArray()));
        }
    }
}
