public class NotificationDispatcher {


    public void dispatchNotification(NotificationEvent event){
        // Get user preferences
        PreferenceService prefService = PreferenceService.getInstance();
        DeliveryLogger logger = new SimpleDeliveryLogger();

        // Check if user is subscribed to this notification type
        if(!prefService.isUserSubscribedToType(event.getUserId(), event.getType())){
            DeliveryLog log = new DeliveryLog(event.getUserId(), event.getEventId(), false, "User not subscribed to this notification type",event.getcreatedAt());
            logger.saveLog(log);
            return;
        }

        // Iterate through channels and send notifications
        for(Channel channel : event.getChannels()){
            // Check if user prefers this channel
            if(prefService.isUserPreferredChannel(event.getUserId(), channel)){
                DeliveryRequest request = new DeliveryRequest(event.getUserId(), event.getEventId(), event.getMessage(),channel);
                NotificationChannel notificationChannel = NotificationChannelFactory.getChannel(channel);
                DeliveryResult result = notificationChannel.sendNotification(request);
                DeliveryLog log = new DeliveryLog(event.getUserId(), event.getEventId(), result.getSuccess(), result.getErrorMessage(),event.getcreatedAt());
                log.setChannel(channel);
                logger.saveLog(log);
            } else {
                DeliveryLog log = new DeliveryLog(event.getUserId(), event.getEventId(), false, "User does not prefer this channel",event.getcreatedAt());
                log.setChannel(channel);
                logger.saveLog(log);
            }
        }
    }

}
