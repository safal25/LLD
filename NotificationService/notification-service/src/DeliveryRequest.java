public class DeliveryRequest {

    private String message;
    private String userId;
    private String eventId;
    private Channel channel;

    public DeliveryRequest(String message, String userId, String eventId, Channel channel) {
        this.message = message;
        this.userId = userId;
        this.eventId = eventId;
        this.channel = channel;
    }

    public String getMessage() {
        return message;
    }

    public String getUserId() {
        return userId;
    }

    public String getEventId() {
        return eventId;
    }

    public Channel getChannel() {
        return channel;
    }

}
