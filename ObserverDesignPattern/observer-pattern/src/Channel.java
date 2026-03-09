import java.util.List;
import java.util.ArrayList;

public class Channel implements Observable {

    private String name;
    private Integer channelId;
    private String latestVideo;
    private static Integer totalChannels = 0;
    List<Observer> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
        this.channelId = ++totalChannels;
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        for(Observer subscriber : subscribers){
            if(subscriber.getId() == observer.getId()){
                subscribers.remove(subscriber);
                break;
            }
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(channelId);
        }
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void getLatestVideo(){
        System.out.println("Latest video of channel " + name + " is " + latestVideo);
    }

    public void uploadVideo(String videoName) {
        this.latestVideo = videoName;
        notifyObservers();
    }

}
