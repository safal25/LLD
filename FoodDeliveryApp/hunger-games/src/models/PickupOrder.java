package models;
import strategies.PaymentStrategy;

public class PickupOrder extends Order {

    private String pickupLocation;

    public PickupOrder(User user, Restaurant restaurant, Cart cart, PaymentStrategy paymentStrategy) {
        super(user, restaurant, cart, paymentStrategy);
        this.pickupLocation = restaurant.getAddress();
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void processOrder() {
        // Logic to process pickup order
        System.out.println("Processing pickup order for user: " + user.getName());
        this.processPayment();
        System.out.println("Order will be ready for pickup at: " + pickupLocation);
    }


}
