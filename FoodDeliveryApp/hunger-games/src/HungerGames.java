import models.*;
import strategies.*;
import factories.*;

import java.util.List;

import managers.*;

public class HungerGames {

    RestaurantManager restaurantManager;
    OrderManager orderManager;

    public HungerGames() {
        this.restaurantManager = RestaurantManager.getInstance();
        this.orderManager = OrderManager.getInstance();
        initializeRestaurants();
    }

    private void initializeRestaurants() {
        Restaurant restaurant1 = new Restaurant("Pizza Place", "123 Main St");
        restaurant1.addMenuItem(new MenuItem("Pepperoni Pizza", "PZ001", 12.99));
        restaurant1.addMenuItem(new MenuItem("Veggie Pizza", "PZ002", 10.99));

        Restaurant restaurant2 = new Restaurant("Burger Joint", "456 Elm St");
        restaurant2.addMenuItem(new MenuItem("Cheeseburger", "BG001", 8.99));
        restaurant2.addMenuItem(new MenuItem("Veggie Burger", "BG002", 7.99));

        Restaurant restaurant3 = new Restaurant("Sushi Spot", "123 Main St");
        restaurant3.addMenuItem(new MenuItem("California Roll", "SU001", 6.99));
        restaurant3.addMenuItem(new MenuItem("Spicy Tuna Roll", "SU002", 7.99));

        Restaurant restaurant4 = new Restaurant("Pasta House", "123 Main St");
        restaurant4.addMenuItem(new MenuItem("Spaghetti Bolognese", "PA001", 11.99));
        restaurant4.addMenuItem(new MenuItem("Fettuccine Alfredo", "PA002", 10.99));

        restaurantManager.addRestaurant(restaurant1);
        restaurantManager.addRestaurant(restaurant2);
        restaurantManager.addRestaurant(restaurant3);
        restaurantManager.addRestaurant(restaurant4);
     }

    public User createUser(String name, String address) {
        User user = new User(name, address, new Cart());
        System.out.println("User created: " + user.getName());
        return user;
    }

    public List<Restaurant> findRestaurants(String location) {
        return this.restaurantManager.getRestaurants(location);
    }

    public Restaurant getSelecRestaurant(Integer restaurantId) {
        return this.restaurantManager.getRestaurantById(restaurantId);
    }

    public void addToCart(User user, MenuItem item, Integer quantity) {
        user.getCart().addCartItem(item, quantity);
        System.out.println("Added to cart: " + item.getName() + " x" + quantity);
    }

    public void placeOrder(User user, Restaurant restaurant, String orderType, PaymentStrategy paymentStrategy) {
        Order order = OrderFactory.createOrder(orderType, user, restaurant, user.getCart(), paymentStrategy);
        orderManager.addOrder(order);
        order.processOrder();
    }


}
