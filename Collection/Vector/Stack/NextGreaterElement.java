/*

NextGreaterElement.java
Concept

Find next greater element for every array element.

Input:

[4, 5, 2, 25]

Output:

4 → 5
5 → 25
2 → 25
25 → -1

*/

import java.util.*;

public class NextGreaterElement
{
    public static void main(String[] args)
    {
        int arr[] = {4, 5, 2, 25};

        Stack<Integer> stack = new Stack<>();

        int result[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--)
        {
            while(!stack.isEmpty() && stack.peek() <= arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                result[i] = -1;
            }
            else
            {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        System.out.println("Next Greater Elements:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}