public class Soldier implements Character {
    private final CharacterType type;
    private final String appearance;

    public Soldier(String appearance) {
        this.type = CharacterType.SOLDIER;
        this.appearance = appearance;
    }

    public CharacterType getType() {
        return type;
    }

    public String getAppearance() {
        return appearance;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying " + type + " at (" + x + ", " + y + ") with " + appearance);
    }
}
