package models;

public class CartItem {
    private MenuItem menuItem;
    private Integer quantity;

    public CartItem(MenuItem menuItem, Integer quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public String getItemName() {
        return menuItem.getName();
    }

    public Double getItemPrice() {
        return menuItem.getPrice()*quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }


}
