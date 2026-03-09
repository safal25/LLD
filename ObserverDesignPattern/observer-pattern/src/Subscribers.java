import java.util.Map;
import java.util.HashMap;

public class Subscribers implements Observer {

    private String name;
    private Integer subscriberId;
    private static Integer totalSubscribers = 0;
    private Map<Integer, Channel> subscribedChannels = new HashMap<>();

    public Subscribers(String name) {
        this.name = name;
        this.subscriberId = ++totalSubscribers;
    }

    @Override
    public void update(Integer channelId) {
        Channel channel = subscribedChannels.get(channelId);
        if (channel != null) {
            channel.getLatestVideo();
        }
    }
    
    @Override
    public Integer getId() {
        return subscriberId;
    }

    public void subscribeChannel(Channel channel) {
        channel.addObserver(this);
        subscribedChannels.put(channel.getChannelId(), channel);
    }

}
