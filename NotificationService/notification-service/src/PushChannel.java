public class PushChannel  implements NotificationChannel {

    @Override
    public DeliveryResult sendNotification(DeliveryRequest request) {
        // Logic to send push notification
        System.out.println("Sending push notification to user " + request.getUserId() + " for " + request.getEventId());
        return new DeliveryResult(true, null);
    }

}
