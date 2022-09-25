package school.lesson4.Task4Park;

public class Park {
    private Attraction[] attraction;
    private int number;

    public Park(int size) {
        this.attraction = new Attraction[size];
        this.number = 0;
    }

    public void addAttraction(String name, String startTime, String endTime, int price) {
        if (this.number == this.attraction.length - 1) {
            return;
        }
        this.attraction[this.number] = new Attraction(name, startTime, endTime, price);
        this.number++;
    }

    public void getAllAttractions() {
        System.out.println("Attractions in the park: ");
        for (int i = 0; i < number; i++) {
            System.out.println(this.attraction[i]);
        }
    }

    class Attraction {
        private final String name;
        private final String startTime;
        private final String finishTime;
        private final int price;

        public Attraction(String name, String startTime, String finishTime, int price) {
            this.name = name;
            this.startTime = startTime;
            this.finishTime = finishTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction  " + name + "\n" +
                    "Start time  " + startTime + "\n" +
                    "Finish time " + finishTime + "\n" +
                    "Price       " + price + "\n";
        }
    }
}
