public class FlyingRobot extends Robot {

    public FlyingRobot(TalkStrategy talkStrategy, WalkStrategy walkStrategy, FlyStrategy flyStrategy) {
        super(talkStrategy, walkStrategy, flyStrategy);
    }

    @Override
    public void display() {
        System.out.println("I am a flying robot.");
    }

}
