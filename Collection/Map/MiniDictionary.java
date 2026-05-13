import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniDictionary {

    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();

        // Adding words and meanings
        dictionary.put("Java", "Programming Language");
        dictionary.put("CPU", "Central Processing Unit");
        dictionary.put("RAM", "Random Access Memory");
        dictionary.put("HTML", "Markup Language");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        // Checking word existence
        if (dictionary.containsKey(word)) {

            System.out.println("Meaning: "
                    + dictionary.get(word));

        } else {

            System.out.println("Word not found.");
        }

        sc.close();
    }
}