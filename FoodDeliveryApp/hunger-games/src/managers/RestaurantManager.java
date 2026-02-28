package managers;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


import models.Restaurant;

public class RestaurantManager {

    private Map<Integer, Restaurant> restaurantsById;
    private static RestaurantManager instance;

    private RestaurantManager(){
        restaurantsById = new HashMap<Integer, Restaurant>();
    }

    public static RestaurantManager getInstance(){
        if(instance == null){
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant restaurant){
        Integer restaurantId = restaurant.getRestaurantId();
        restaurantsById.put(restaurantId, restaurant);
    }

    public List<Restaurant> getRestaurants(String location) {
        List<Restaurant> nearbyRestaurants = new ArrayList<Restaurant>();
        for (Restaurant restaurant : restaurantsById.values()) {
            if (restaurant.getAddress().equals(location)) {
                nearbyRestaurants.add(restaurant);
            }
        }
        return nearbyRestaurants;
    }

    public Restaurant getRestaurantById(Integer restaurantId) {
        if(restaurantsById.containsKey(restaurantId)){
            return restaurantsById.get(restaurantId);
        }
        return null;
    }

}
