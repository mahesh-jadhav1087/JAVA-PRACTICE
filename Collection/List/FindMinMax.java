// Find Largest Number
// Store integers in ArrayList
// Find largest and smallest number manually

import java.util.ArrayList;

public class FindMinMax {
    public static void main(String[] args) {
        // 1. Store integers in an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(3);
        numbers.add(67);
        numbers.add(21);

        // Ensure the list is not empty before searching
        if (numbers.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        // 2. Initialize largest and smallest with the first element
        int largest = numbers.get(0);
        int smallest = numbers.get(0);

        // 3. Manually iterate to find min and max
        for (int i = 1; i < numbers.size(); i++) {
           
            
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
            
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
            }
        }

        // Output results
        System.out.println("Numbers in List: " + numbers);
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
    }
}