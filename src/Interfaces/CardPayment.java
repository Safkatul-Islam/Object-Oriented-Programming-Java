package Interfaces;

public class CardPayment implements Payment{
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using card " + cardNumber);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to card " + cardNumber);
    }
}
