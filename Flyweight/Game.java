public class Game {
    public static void main(String[] args) {
        Character soldier1 = CharacterFactory.getCharacter("Soldier");
        soldier1.display(10, 20);

        Character soldier2 = CharacterFactory.getCharacter("Soldier");
        soldier2.display(30, 40);

        Character tree = CharacterFactory.getCharacter("Tree");
        tree.display(22, 65);

        // Both soldier1 and soldier2 share the same Soldier instance
        System.out.println(soldier1 == soldier2);
    }
}