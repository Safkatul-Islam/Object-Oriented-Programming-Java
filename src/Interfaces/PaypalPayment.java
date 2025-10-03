package Interfaces;

public class PaypalPayment implements Payment{
    private String email;

    public PaypalPayment(String email) { this. email = email; }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account " + email);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to PayPal account " + email);
    }
}
