public class SimpleDeliveryLogger implements DeliveryLogger {

    @Override
    public void saveLog(DeliveryLog log) {
        // Logic to save delivery log, e.g., to a database or file
        System.out.println("Saving delivery log for user " + log.getUserId() + " for event " + log.getEventId() + " at " + log.getTimestamp() + " with status " + log.getSuccess());
    }

}
