import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, Character> characters = new HashMap<>();

    public static Character getCharacter(String characterType) {
        if (characters.containsKey(characterType)) {
            return characters.get(characterType);
        }
        Character character = switch (characterType) {
            case "Soldier" -> new Soldier("Soldier Appearance");
            case "Tree" -> new Tree("Tree Appearance");
            case "Building" -> new Building("Building Appearance");
            default -> throw new RuntimeException("Invalid Character Type");
        };
        characters.put(characterType, character);
        return character;
    }
}
