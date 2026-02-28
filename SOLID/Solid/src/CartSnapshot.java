import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CartSnapshot {

    private final List<CartSnapshotItem> items;
    private final BigDecimal total;

    public CartSnapshot(List<CartSnapshotItem> items, BigDecimal total) {
        if (items == null) {
            throw new IllegalArgumentException("Items cannot be null.");
        }
        if (total == null) {
            throw new IllegalArgumentException("Total cannot be null.");
        }

        this.items = Collections.unmodifiableList(new ArrayList<>(items));
        this.total = total;
    }

    public List<CartSnapshotItem> getItems() {
        return items;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public String toStoragePayload() {
        String itemsPayload = items.stream()
                .map(item -> String.format(
                        "{productId:'%s',name:'%s',price:%s,quantity:%d,lineTotal:%s}",
                        item.getProductId(),
                        item.getName(),
                        item.getPrice(),
                        item.getQuantity(),
                        item.getLineTotal()))
                .collect(Collectors.joining(", "));

        return "{items:[" + itemsPayload + "], total:" + total + "}";
    }
}
