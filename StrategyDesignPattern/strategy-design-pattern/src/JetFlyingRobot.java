public class JetFlyingRobot extends Robot {

    public JetFlyingRobot(TalkStrategy talkStrategy, WalkStrategy walkStrategy, FlyStrategy flyStrategy) {
        super(talkStrategy, walkStrategy, flyStrategy);
    }

    @Override
    public void display() {
        System.out.println("I am a jet flying robot.");
    }

}
