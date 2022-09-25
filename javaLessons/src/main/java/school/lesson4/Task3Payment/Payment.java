package school.lesson4.Task3Payment;

public class Payment {
    private Item[] items;
    private int quantity;
    private int payment = 0;

    public Payment(int size) {
        this.items = new Item[size];
        this.quantity = 0;
    }

    public void addItem(String name, int price, int count) {
        if (this.quantity == this.items.length) {
            return;
        }
        this.items[this.quantity] = new Item(name, price, count);
        this.quantity++;
    }

    public void seePayment() {
        System.out.println("Purchases: ");
        for (Item item : items) {
            System.out.println(item);
            payment += item.getPrice();
        }
        System.out.println("Total: " + payment + "\n");
    }

    class Item {
        private final String name;
        private final int price;
        private final int count;

        public int getPrice() {
            return price;
        }

        public Item(String name, int price, int count) {
            this.name = name;
            this.price = price;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Item     " + name + "\n" +
                    "Price    " + price + "\n" +
                    "Quantity " + count + "\n";
        }
    }
}
