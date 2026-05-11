import java.util.HashMap;
import java.util.LinkedHashSet;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String text = "programming";

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        LinkedHashSet<Character> orderedChars = new LinkedHashSet<>();

        for (char ch : text.toCharArray()) {

            orderedChars.add(ch);

            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        for (char ch : orderedChars) {

            if (frequencyMap.get(ch) == 1) {
                System.out.println("First Non-Repeated Character: " + ch);
                break;
            }
        }
    }
}