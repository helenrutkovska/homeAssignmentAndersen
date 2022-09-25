package school.lesson4.Task4Park;

public class ParkApp {
    public static void main(String[] args) {
        Park park = new Park(3);
        park.addAttraction("Jump Arena", "01:00", "10:00", 7);
        park.addAttraction("Ice Rink", "01:00", "12:00", 9);
        park.addAttraction("Go Kart", "01:00", "06:00", 4);
        park.getAllAttractions();
    }
}
