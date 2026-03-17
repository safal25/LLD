public class NotificationApi {

    private NotificationDispatcher dispatcher;

    public NotificationApi(NotificationDispatcher dispatcher) {
        this.dispatcher = new NotificationDispatcher();
    }

    public void publishNotification(NotificationEvent event) {
        // Logic to publish notification, e.g., to a message queue
        System.out.println("Publishing notification for event " + event.getEventId() + " with message: " + event.getMessage());
        dispatcher.dispatchNotification(event);
    }

}
