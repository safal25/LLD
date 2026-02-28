package managers;

import java.util.List;
import java.util.ArrayList;
import models.Order;

public class OrderManager {

    private List<Order> orders;
    private static OrderManager instance;

    private OrderManager() {
        orders = new ArrayList<Order>();
    }

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }   

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersByUser(Integer userId) {
        List<Order> userOrders = new ArrayList<Order>();
        for (Order order : orders) {
            if (order.getUser().getUserId().equals(userId)) {
                userOrders.add(order);
            }
        }
        return userOrders;
    }



}
