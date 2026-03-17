import java.util.EnumSet;

public class UserPreference {

    private String userId;
    private EnumSet<Channel> preferredChannels;
    private EnumSet<NotificationType> subscribedNotificationTypes;

    public UserPreference(String userId) {
        this.userId = userId;
        this.preferredChannels = EnumSet.allOf(Channel.class);
        this.subscribedNotificationTypes = EnumSet.allOf(NotificationType.class);
    }

    public void addPreferredChannel(Channel channel) {
        preferredChannels.add(channel);
    }

    public void removePreferredChannel(Channel channel) {
        preferredChannels.remove(channel);
    }

    public void addNotificationType(NotificationType type) {
        subscribedNotificationTypes.add(type);
    }

    public void removeNotificationType(NotificationType type) {
        subscribedNotificationTypes.remove(type);
    }

    public Boolean isSubscribedType(NotificationType type) {
        return subscribedNotificationTypes.contains(type);
    }

    public Boolean isPreferredChannel(Channel channel) {
        return preferredChannels.contains(channel);
    }

    public String getUserId() {
        return userId;
    }

}
