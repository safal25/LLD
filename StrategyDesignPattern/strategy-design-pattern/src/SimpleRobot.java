public class SimpleRobot extends Robot {

    public SimpleRobot(TalkStrategy talkStrategy, WalkStrategy walkStrategy, FlyStrategy flyStrategy) {
        super(talkStrategy, walkStrategy, flyStrategy);
    }

    @Override
    public void display() {
        System.out.println("I am a simple robot.");
    }
}
