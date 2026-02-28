public class MongoDbCartStorage implements CartStorage {

    @Override
    public void store(CartSnapshot snapshot) {
        // Placeholder for a real MongoDB implementation.
        System.out.println("Stored cart in MongoDB: " + snapshot.toStoragePayload());
    }
}
