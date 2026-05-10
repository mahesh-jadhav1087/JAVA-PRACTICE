import java.util.LinkedHashSet;

public class FindUniqueCharacters {

    public static void main(String[] args) {

        String text = "programming";

        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : text.toCharArray()) {
            uniqueChars.add(ch);
        }

        System.out.println("Unique Characters:");
        System.out.println(uniqueChars);
    }
}