import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {

    private final Map<String, CartItem> itemsByProductId = new LinkedHashMap<>();

    public void addProduct(Product product) {
        addProduct(product, 1);
    }

    public void addProduct(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }

        CartItem existingItem = itemsByProductId.get(product.getId());
        if (existingItem == null) {
            itemsByProductId.put(product.getId(), new CartItem(product, quantity));
        } else {
            existingItem.increaseQuantity(quantity);
        }
    }

    public void removeProduct(String productId) {
        itemsByProductId.remove(productId);
    }

    public void removeProduct(String productId, int quantity) {
        CartItem existingItem = itemsByProductId.get(productId);
        if (existingItem == null) {
            return;
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }

        if (quantity >= existingItem.getQuantity()) {
            itemsByProductId.remove(productId);
        } else {
            existingItem.decreaseQuantity(quantity);
        }
    }

    public BigDecimal calculateTotalPrice() {
        return itemsByProductId.values()
                .stream()
                .map(CartItem::getLineTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Collection<CartItem> getItems() {
        return Collections.unmodifiableCollection(itemsByProductId.values());
    }
}
