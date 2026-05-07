/*
Separate Even and Odd Numbers

Store numbers in one list and create:

Even list
Odd list
 */

import java.util.ArrayList;

public class SeparateNumbers {
    public static void main(String[] args) {
        // 1. Original list of numbers
        ArrayList<Integer> mainList = new ArrayList<>();
        int[] data = {12, 7, 22, 15, 30, 43, 8, 91};
        for (int num : data) mainList.add(num);

        // 2. Create Even and Odd lists
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        // 3. Separate the numbers
        for (int num : mainList) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        // Output results
        System.out.println("Main List: " + mainList);
        System.out.println("Even List: " + evenList);
        System.out.println("Odd List:  " + oddList);
    }
}