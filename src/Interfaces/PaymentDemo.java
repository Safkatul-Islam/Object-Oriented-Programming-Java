package Interfaces;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CardPayment("1234-1245-4567-9876");
        Payment p2 = new PaypalPayment("Ryan@gmail.com");

        p1.pay(200);
        p2.pay(500);

        p1.refund(600);
        p2.refund(50    );
    }
}
