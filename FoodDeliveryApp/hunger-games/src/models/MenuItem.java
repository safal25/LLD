package models;

public class MenuItem {

    private String name;
    private String itemCode;
    private Double price;

    public MenuItem(String name, String itemCode, Double price) {
        this.name = name;
        this.itemCode = itemCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getItemCode() {
        return itemCode;
    }

    public Double getPrice() {
        return price;
    }

}
