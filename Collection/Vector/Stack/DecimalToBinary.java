// Decimal to Binary 

import java.util.*;

public class DecimalToBinary
{
    public static void main(String[] args)
    {
        int number = 10;

        Stack<Integer> stack = new Stack<>();

        while(number > 0)
        {
            int rem = number % 2;
            System.out.println(rem);
            stack.push(rem);
            number = number / 2;
        }

        System.out.print("Binary Value: ");

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    }
}