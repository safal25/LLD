package strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(Double amount) {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment of $" + amount + " for card number: " + cardNumber + " belonging to " + cardHolderName + " with expiry date: " + expiryDate + " and CVV: " + cvv);
    }

}
