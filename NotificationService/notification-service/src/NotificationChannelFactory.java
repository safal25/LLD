public class NotificationChannelFactory {

    public static NotificationChannel getChannel(Channel channel) {
        switch (channel) {
            case EMAIL:
                return new EmailChannel();
            case SMS:
                return new SMSChannel();
            case PUSH_NOTIFICATION:
                return new PushChannel();
            default:
                throw new IllegalArgumentException("Unsupported channel: " + channel);
        }
    }

}
