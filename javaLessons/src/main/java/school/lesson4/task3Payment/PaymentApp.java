package school.lesson4.task3Payment;

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment = new Payment(6);
        payment.addItem("Book", 7, 1);
        payment.addItem("Pen", 1, 4);
        payment.addItem("Pencilcase", 5, 2);
        payment.addItem("Mirror", 14, 1);
        payment.addItem("Table", 28, 2);
        payment.addItem("Armchair", 32, 3);
        payment.seePayment();
    }
}
