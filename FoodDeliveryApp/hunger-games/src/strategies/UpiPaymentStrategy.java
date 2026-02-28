package strategies;

public class UpiPaymentStrategy implements PaymentStrategy {

    private String upiId;

    public UpiPaymentStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing UPI payment of amount: " + amount + " using UPI ID: " + upiId);
        // Here you would integrate with a real UPI payment gateway
    }

}
