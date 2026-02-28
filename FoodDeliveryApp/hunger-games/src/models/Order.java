package models;

import java.util.List;
import strategies.*;

public abstract class Order {

    protected Integer orderId;
    protected User user;
    protected Restaurant restaurant;
    protected Cart cart;
    protected List<CartItem> cartItems;
    protected Double totalPrice;
    protected PaymentStrategy paymentStrategy;

    public Order(User user, Restaurant restaurant, Cart cart, PaymentStrategy paymentStrategy) {
        this.user = user;
        this.restaurant = restaurant;
        this.cart = cart;
        this.paymentStrategy = paymentStrategy;
        this.cartItems = cart.getCartItems();
        this.totalPrice = cart.getTotalPrice();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }   

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Cart getCart() {
        return cart;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public boolean processPayment() {
        paymentStrategy.processPayment(totalPrice);
        return true;
    }

    public abstract void processOrder();


}
