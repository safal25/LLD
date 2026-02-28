import models.*;
import strategies.*;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Initialize the application
        HungerGames hungerGames = new HungerGames();

        // Create a user
        User newUser = hungerGames.createUser("Safal", "123 Main St");

        // Find restaurants in the user's location
        List<Restaurant> nearbyRestaurants = hungerGames.findRestaurants(newUser.getAddress());
        System.out.println("Nearby Restaurants:");
        for (Restaurant restaurant : nearbyRestaurants) {
            System.out.println("- " + restaurant.getName() + " at " + restaurant.getAddress());
        }

        // Select a restaurant and add items to cart
        if (!nearbyRestaurants.isEmpty()) {
            Restaurant selectedRestaurant = nearbyRestaurants.get(0);
            System.out.println("Selected Restaurant: " + selectedRestaurant.getName());

            MenuItem menuItem = selectedRestaurant.getMenu().get(0);
            MenuItem menuItem2 = selectedRestaurant.getMenu().get(1);
            hungerGames.addToCart(newUser, menuItem, 2);
            hungerGames.addToCart(newUser, menuItem2, 1);

            // Create an order using the factory
            hungerGames.placeOrder(newUser, selectedRestaurant, "DELIVERY", new CreditCardPaymentStrategy("1234-5678-9012-3456", "Safal", "12/25", "123"));
        }
        
       
    }
}
