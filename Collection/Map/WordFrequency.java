/* Count Frequency of Each Word

Input:

java is easy java is powerful

Output:

java = 2
is = 2
easy = 1
powerful = 1
*/

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String input = "java is easy java is powerful";
        
        // 1. Split the string into words based on spaces
        String[] words = input.split(" ");
        
        // 2. Use a HashMap to store word counts
        // Key: Word (String), Value: Count (Integer)
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            // If the word exists, increment its count; otherwise, start at 1
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // 3. Print the output
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}