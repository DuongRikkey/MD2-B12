package DSAStackQuene;

import java.util.Scanner;
import java.util.Stack;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> st = new Stack<>();
        System.out.println("Enter a string with parent ");
        String input = sc.nextLine();

        boolean isValid = true;
        for(char ch : input.toCharArray()) {
            if(ch == '('|| ch == '{' || ch == '[') {
                st.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']') {
                if(st.isEmpty()) {
                    isValid = false;
                    break;
                }
                char top = st.pop();
                if(top != '(' && top != '{' && top != '[') {
                    isValid = false;
                        break;
                }
            }
        }
        if(!st.isEmpty()) {
            isValid = false;
        }
        if(isValid) {
            System.out.println("The string has valid parentheses.");
        }else {
            System.out.println("The string has invalid parentheses");

        }


    }

}
