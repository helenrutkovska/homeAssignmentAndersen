package school.lesson5.Task1SwapElements;

public class SwapArrayElementsOption2 {
    //changing elements of an array using a constructor

    public static void main(String[] args) {
        SwapActionsOption2.Action<String> tools = new SwapActionsOption2.Action<>("Selenium", "Rest Assured", "Docker", "Jenkins");
        tools.swap(0, 2);

        SwapActionsOption2.Action<Integer> dates = new SwapActionsOption2.Action<>(123, 517, 987, 385, 567, 345);
        dates.swap(1, 5);
    }
}
