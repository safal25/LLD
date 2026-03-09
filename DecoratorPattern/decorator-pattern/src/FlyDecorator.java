public class FlyDecorator implements Decorator {

    public Character character;

    public FlyDecorator(Character character) {
        this.character = character;
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + ", Flying ability";
    }

}
