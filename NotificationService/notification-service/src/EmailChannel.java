public class EmailChannel implements NotificationChannel {

    @Override
    public DeliveryResult sendNotification(DeliveryRequest request) {
        // Logic to send email notification
        //fetching email address from userId and sending email
        System.out.println("Fetching email address for user " + request.getUserId());
        // Simulating email sending
        System.out.println("Sending email notification to " + request.getUserId() + " for " + request.getEventId());
        return new DeliveryResult(true, null);
    }

}
