/*
BalancedParentheses.java


Rules:

Every opening bracket must have a closing bracket
Order should be correct

Examples:

({[]})  → Balanced
((())   → Not Balanced
Logic
Push opening brackets into stack
When closing bracket comes:
check top element
if matching → pop
else → invalid
 */

import java.util.*;

public class BalancedParentheses
{
    public static void main(String[] args)
    {
        String str = "({[]})";

        Stack<Character> stack = new Stack<>();

        boolean balanced = true;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']')
            {
                if(stack.isEmpty())
                {
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') ||  (ch == '}' && top != '{') ||  (ch == ']' && top != '['))
                {
                    balanced = false;
                    break;
                }
            }
        }

        if(!stack.isEmpty())
        {
            balanced = false;
        }

        if(balanced)
        {
            System.out.println("Balanced Parentheses");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }
}