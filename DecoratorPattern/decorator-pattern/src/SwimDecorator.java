public class SwimDecorator implements Decorator {

    public Character character;

    public SwimDecorator(Character character) {
        this.character = character;
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + ", Swimming ability";
    }

}
