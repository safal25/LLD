public abstract class Robot {
    protected TalkStrategy talkStrategy;
    protected WalkStrategy walkStrategy;
    protected FlyStrategy flyStrategy;

    public Robot(TalkStrategy talkStrategy, WalkStrategy walkStrategy, FlyStrategy flyStrategy) {
        this.talkStrategy = talkStrategy;
        this.walkStrategy = walkStrategy;
        this.flyStrategy = flyStrategy;
    }

    public void performTalk() {
        talkStrategy.talk();
    }

    public void performWalk() {
        walkStrategy.walk();
    }

    public void performFly() {
        flyStrategy.fly();
    }

    public abstract void display();
}
