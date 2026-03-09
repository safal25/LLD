public class App {
    public static void main(String[] args) throws Exception {
        Channel channel1 = new Channel("Channel 1");
        Channel channel2 = new Channel("Channel 2");

        Subscribers subscriber1 = new Subscribers("Subscriber 1");
        Subscribers subscriber2 = new Subscribers("Subscriber 2");

        subscriber1.subscribeChannel(channel1);
        subscriber1.subscribeChannel(channel2);

        subscriber2.subscribeChannel(channel1);

        channel1.uploadVideo("Video 1");
        channel2.uploadVideo("Video 2");    


    }
}
