public class DeliveryLog {

    private String userId;
    private String eventId;
    private Channel channel;
    private Boolean success;
    private String errorMessage;
    private Long timestamp;

    public DeliveryLog(String userId, String eventId, Boolean success, String errorMessage, Long timestamp) {
        this.userId = userId;
        this.eventId = eventId;
        this.success = success;
        this.errorMessage = errorMessage;
        this.timestamp = timestamp;
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

    public Boolean getSuccess() {
        return success;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }


}
