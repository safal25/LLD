public class PostgresCartStorage implements CartStorage {

    @Override
    public void store(CartSnapshot snapshot) {
        // Placeholder for a real Postgres implementation.
        System.out.println("Stored cart in Postgres: " + snapshot.toStoragePayload());
    }
}
