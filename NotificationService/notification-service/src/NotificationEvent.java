import java.util.List;

public class NotificationEvent {

    private NotificationType type;
    private List<Channel> channels;
    private String message;
    private String userId;
    private String sourceService;
    private long createdAt;
    private String eventId;
    private static int idCounter = 0;

    public NotificationEvent(NotificationType type, List<Channel> channels, String message, String userId, String sourceService) {
        this.type = type;
        this.channels = channels;
        this.message = message;
        this.userId = userId;
        this.sourceService = sourceService;
        this.createdAt = System.currentTimeMillis();
        this.eventId = generateEventId();
    }

    private synchronized String generateEventId() {
        return "EVT-" + (++idCounter);
    }

    public NotificationType getType() {
        return type;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public String getMessage() {
        return message;
    }

    public String getUserId() {
        return userId;
    }

    public String getSourceService() {
        return sourceService;
    }

    public long getcreatedAt() {
        return createdAt;
    }

    public String getEventId() {
        return eventId;
    }

}
