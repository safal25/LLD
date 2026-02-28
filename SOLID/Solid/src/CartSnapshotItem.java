import java.math.BigDecimal;

public class CartSnapshotItem {

    private final String productId;
    private final String name;
    private final BigDecimal price;
    private final int quantity;
    private final BigDecimal lineTotal;

    public CartSnapshotItem(String productId, String name, BigDecimal price, int quantity, BigDecimal lineTotal) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.lineTotal = lineTotal;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getLineTotal() {
        return lineTotal;
    }
}
