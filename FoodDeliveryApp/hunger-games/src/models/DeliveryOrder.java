package models;

import strategies.PaymentStrategy;

public class DeliveryOrder extends Order {
    private String deliveryAddress;

    public DeliveryOrder(User user, Restaurant restaurant, Cart cart,PaymentStrategy paymentStrategy) {
        super(user, restaurant, cart, paymentStrategy);
        this.deliveryAddress = user.getAddress();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void processOrder() {
        // Logic to process delivery order
        System.out.println("Processing delivery order for user: " + user.getName());
        this.processPayment();
        System.out.println("Order will be delivered to: " + deliveryAddress);
    }

}
