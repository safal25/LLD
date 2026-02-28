import java.util.List;
import java.util.stream.Collectors;

public class CartPersistenceService {

    private final CartStorage storage;

    public CartPersistenceService(CartStorage storage) {
        if (storage == null) {
            throw new IllegalArgumentException("Storage implementation cannot be null.");
        }
        this.storage = storage;
    }

    public void store(Cart cart) {
        storage.store(buildSnapshot(cart));
    }

    private CartSnapshot buildSnapshot(Cart cart) {
        if (cart == null) {
            throw new IllegalArgumentException("Cart cannot be null.");
        }

        List<CartSnapshotItem> items = cart.getItems().stream()
                .map(item -> new CartSnapshotItem(
                        item.getProduct().getId(),
                        item.getProduct().getName(),
                        item.getProduct().getPrice(),
                        item.getQuantity(),
                        item.getLineTotal()))
                .collect(Collectors.toList());

        return new CartSnapshot(items, cart.calculateTotalPrice());
    }
}
