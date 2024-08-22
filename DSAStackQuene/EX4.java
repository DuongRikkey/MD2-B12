package DSAStackQuene;

import java.util.Scanner;
import java.util.Stack;

public class EX4 {
    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập biểu thức từ bàn phím
        System.out.print("Nhập biểu thức cần kiểm tra: ");
        String expression = scanner.nextLine();

        // Kiểm tra tính hợp lệ của dấu ngoặc
        boolean result = isValidExpression(expression);

        // Hiển thị kết quả
        if (result) {
            System.out.println("Biểu thức hợp lệ.");
        } else {
            System.out.println("Biểu thức không hợp lệ.");
        }
    }
}
