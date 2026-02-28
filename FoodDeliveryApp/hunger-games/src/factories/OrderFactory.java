package factories;
import models.*;
import strategies.PaymentStrategy;

public class OrderFactory {

    public static Order createOrder(String orderType, User user, Restaurant restaurant, Cart cart, PaymentStrategy paymentStrategy) {
        if (orderType.equalsIgnoreCase("DELIVERY")) {
            return new DeliveryOrder(user, restaurant, cart, paymentStrategy);
        } else if (orderType.equalsIgnoreCase("PICKUP")) {
            return new PickupOrder(user, restaurant, cart, paymentStrategy);
        }
        throw new IllegalArgumentException("Invalid order type: " + orderType);
    }
}
