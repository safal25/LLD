package models;

import java.util.List;
import java.util.ArrayList;

public class Restaurant {

    private List<MenuItem> menuItems;
    private String name;    
    private String address;
    private Integer restaurantId;
    private static Integer idCounter = 0;

    public Restaurant(String name, String address){
        this.name = name;
        this.address = address;
        menuItems = new ArrayList<MenuItem>();
        this.restaurantId = ++idCounter;
    }

    public void addMenuItem(MenuItem item){
        menuItems.add(item);
    }

    public List<MenuItem> getMenu() {
        return menuItems;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }


}
