package models;

import java.util.List;
import java.util.ArrayList;

public class Cart {

    private List<CartItem> cartItems;

    public Cart() {
        cartItems = new ArrayList<CartItem>();
    }

    public void addCartItem(MenuItem item, Integer quantity) {
        CartItem cartItem = new CartItem(item, quantity);
        cartItems.add(cartItem);
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public Double getTotalPrice() {
        Double totalPrice = 0.0;
        for (CartItem cartItem : cartItems) {
            totalPrice += cartItem.getItemPrice();
        }
        return totalPrice;
    }

}