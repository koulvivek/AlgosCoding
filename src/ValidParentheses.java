/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true


 */

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        // for a valid string there are always going to even number of braces..
        if (s.length() % 2 != 0) {
            return false;
        }
        // Create a stack to solve this
        Stack<Character> stack = new Stack();

        // loop through the string using a char array
        /*
         for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
         */

        for (char c : s.toCharArray()) {

            // check for the character to be an opening Parentheses..and if yes then push it to the stack.
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            /*
            If we encounter a closing bracket, then we check the element on top of the stack.
            If the element at the top of the stack is an opening bracket of the same type,
            then we pop it off the stack and continue processing.
            Else, this implies an invalid expression.
             */
            else if (c == ')' && !stack.isEmpty() && stack.peek() == ')') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }


        }
        return stack.isEmpty();
    }

}