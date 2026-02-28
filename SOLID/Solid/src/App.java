import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        Product laptop = new Product("P-101", "Laptop", new BigDecimal("1200.00"));
        Product mouse = new Product("P-102", "Mouse", new BigDecimal("25.50"));
        Product keyboard = new Product("P-103", "Keyboard", new BigDecimal("45.00"));

        Cart cart = new Cart();
        cart.addProduct(laptop, 1);
        cart.addProduct(mouse, 2);
        cart.addProduct(keyboard, 1);

        cart.removeProduct("P-102", 1); // Remove one mouse

        System.out.println("Cart total: " + cart.calculateTotalPrice());

        CartPersistenceService persistenceService = new CartPersistenceService(
                new MongoDbCartStorage());

        persistenceService.store(cart);
    }
}
