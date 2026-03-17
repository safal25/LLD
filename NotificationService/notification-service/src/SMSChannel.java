public class SMSChannel implements NotificationChannel {

    @Override
    public DeliveryResult sendNotification(DeliveryRequest request) {
        // Logic to send SMS notification
        System.out.println("Sending SMS to user " + request.getUserId() + " for " + request.getEventId());
        return new DeliveryResult(true, null);
    }

}
