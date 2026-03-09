public class App {
    public static void main(String[] args) throws Exception {
        Character sonic = new Sonic();
        System.out.println("Sonic's abilities: " + sonic.getAbilities());

        Character flyingSonic = new FlyDecorator(sonic);
        System.out.println("Flying Sonic's abilities: " + flyingSonic.getAbilities());

        Character swimmingSonic = new SwimDecorator(sonic);
        System.out.println("Swimming Sonic's abilities: " + swimmingSonic.getAbilities());

        Character flyingSwimmingSonic = new SwimDecorator(flyingSonic);
        System.out.println("Flying Swimming Sonic's abilities: " + flyingSwimmingSonic.getAbilities());
    }
}
