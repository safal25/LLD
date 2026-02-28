package models;
public class User {
    private String name;
    private String address;
    private Integer userId;
    private Cart cart;
    private static Integer idCounter = 0;

    public User(String name, String address, Cart cart) {
        this.name = name;
        this.address = address;
        this.cart = cart;
        this.userId = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Cart getCart() {
        return cart;
    }

    public Integer getUserId() {
        return userId;
    }

}
