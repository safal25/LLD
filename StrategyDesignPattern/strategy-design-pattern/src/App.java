public class App {
    public static void main(String[] args) throws Exception {
        Robot simpleRobot = new SimpleRobot(new SimpleTalk(), new SimpleWalk(), new NoFly());
        simpleRobot.display();
        simpleRobot.performTalk();
        simpleRobot.performWalk();
        simpleRobot.performFly();

        System.out.println();

        Robot flyingRobot = new FlyingRobot(new NoTalk(), new SimpleWalk(), new SimpleFly());
        flyingRobot.display();
        flyingRobot.performTalk();
        flyingRobot.performWalk();
        flyingRobot.performFly();

        System.out.println();

        Robot jetFlyingRobot = new JetFlyingRobot(new SimpleTalk(), new SimpleWalk(), new JetFly());
        jetFlyingRobot.display();
        jetFlyingRobot.performTalk();
        jetFlyingRobot.performWalk();
        jetFlyingRobot.performFly();
    }
}
